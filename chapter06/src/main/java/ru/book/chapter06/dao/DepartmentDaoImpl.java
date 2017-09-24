package ru.book.chapter06.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.book.chapter06.model.Department;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao{


    @PersistenceContext
    private EntityManager em;

    @Override
    public Department createDepartment(Department department) {
        em.persist(department);
        return department;
    }

    @Override
    public Department updateDepartment(Department department) {
        em.merge(department);
        return department;
    }

    @Override
    public Department getDepartmentById(int id) {
        return em.find(Department.class, id);
    }

    @Override
    public void removeDepartment(Department department) {
        em.remove(em.contains(department) ? department : em.merge(department));
//        em.remove(department);
    }

    @Override
    public List<Department> findDepartments() {
        return em.createNamedQuery("Department.findAll", Department.class).getResultList();
    }
}
