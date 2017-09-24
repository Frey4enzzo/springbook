package ru.book.chapter06;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import ru.book.chapter06.dao.DepartmentDao;
import ru.book.chapter06.dao.DepartmentDaoImpl;
import ru.book.chapter06.model.Department;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("/META-INF/spring/persistence-context.xml");
        ctx.refresh();

        DepartmentDao dep = ctx.getBean("departmentDaoImpl", DepartmentDao.class);

//        Department dep1 = dep.getDepartmentById(12);

        dep.findDepartments().forEach(d -> System.out.println(d));


    }
}
