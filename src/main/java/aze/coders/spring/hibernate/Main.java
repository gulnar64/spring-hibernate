package aze.coders.spring.hibernate;

import aze.coders.spring.hibernate.config.SpringHibernateConfig;
import aze.coders.spring.hibernate.dao.CustomersDao;
import aze.coders.spring.hibernate.dao.EmployerDao;
import aze.coders.spring.hibernate.entity.Customers;
import aze.coders.spring.hibernate.entity.Employer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
        CustomersDao customersDao = context.getBean( CustomersDao.class);
//        employerDao.save(new Employer(2, "EmpName"));
        System.out.println(customersDao.findByName("Gulnar"));
    }
}