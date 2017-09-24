package ru.book.chapter06_1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hobby")
public class Hobby {

    private String hobbyId;
    private Set<Contact> contacts;

    @Id
    @Column(name = "HOBBY_ID")
    public String getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }

    @ManyToMany
    @JoinTable(name = "contact_hobby_detail",
               joinColumns = @JoinColumn(name="HOBBY_ID"),
               inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"))
    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public String toString() {
        return "Hobby: " + getHobbyId();
    }
}