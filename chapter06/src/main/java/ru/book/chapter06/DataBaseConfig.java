package ru.book.chapter06;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

//@Configuration
//@ComponentScan(basePackages = "ru.book.chapter06.*")
//@EnableTransactionManagement
public class DataBaseConfig {

    protected static final String PROPERTY_NAME_DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String PROPERTY_NAME_DATABASE_URL = "jdbc:mysql://localhost:3306/zato";
    protected static final String PROPERTY_NAME_DATABASE_USERNAME = "root";
    protected static final String PROPERTY_NAME_DATABASE_PASSWORD = "123456";

    private static final String PROPERTY_PACKAGES_TO_SCAN = "ru.book.chapter06.*";

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
//            (DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource);
//        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
//        entityManagerFactoryBean.setPackagesToScan(PROPERTY_PACKAGES_TO_SCAN);
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    public BasicDataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(PROPERTY_NAME_DATABASE_DRIVER);
//        dataSource.setUrl(PROPERTY_NAME_DATABASE_URL);
//        dataSource.setUsername(PROPERTY_NAME_DATABASE_USERNAME);
//        dataSource.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
//        return dataSource;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter(){
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setDatabase(Database.MYSQL);
//        adapter.setShowSql(true);
//        adapter.setGenerateDdl(true);
//        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//        return adapter;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory em) {
//        return new JpaTransactionManager(em);
//    }
}
