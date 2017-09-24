package ru.book.chapter06_1.dao;

import ru.book.chapter06_1.models.Contact;
import java.util.List;

public interface ContactService {

    List<Contact> findAll();
    List<Contact> findAllWithDetails();
    Contact findById(Long id);
    Contact save(Contact contact);
    void delete(Contact contact);
}
