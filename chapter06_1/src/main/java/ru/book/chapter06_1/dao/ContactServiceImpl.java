package ru.book.chapter06_1.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.book.chapter06_1.models.Contact;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Можно использовать на выбор @Service(название) или @Repository
 */

@Service("jpaContactService")
//@Repository
@Transactional
public class ContactServiceImpl implements ContactService{

    @PersistenceContext
    private EntityManager em;

    public List<Contact> findAll() {
        return em.createNamedQuery("Contact.findAll", Contact.class).getResultList();
    }


    public List<Contact> findAllWithDetails() {
        return em.createQuery("select distinct c from Contact c " +
                "left join fetch c.contactTelDetails t left join fetch c.hobbies h")
                .getResultList();
    }


    public Contact findById(Long id) {
        return em.find(Contact.class, id);
    }


    public Contact save(Contact contact) {
        return null;
    }


    public void delete(Contact contact) {

    }
}
