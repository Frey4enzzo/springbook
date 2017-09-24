package ru.book.chapter06_1;


import org.springframework.context.support.GenericXmlApplicationContext;
import ru.book.chapter06_1.dao.ContactService;
import ru.book.chapter06_1.dao.ContactSummaryUntypeImpl;

public class Main {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/persistence-context.xml");
        ctx.refresh();

        ContactService service = ctx.getBean("jpaContactService", ContactService.class);

        service.findAllWithDetails().forEach(contact -> {
            System.out.println(contact);
            if (contact.getContactTelDetails() != null) {
                contact.getContactTelDetails().forEach(contactTelDetail -> {
                    System.out.println(contactTelDetail);
                });
            }
            if (contact.getHobbies() != null) {
                contact.getHobbies().forEach(hobby -> {
                    System.out.println(hobby);
                });
            }
            System.out.println();
        });

        ContactSummaryUntypeImpl summaryUntype = ctx.getBean("contactSummaryUntype",
                ContactSummaryUntypeImpl.class);
        summaryUntype.displayAllSummary();
    }
}
