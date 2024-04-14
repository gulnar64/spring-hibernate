package aze.coders.spring.hibernate.dao;

import aze.coders.spring.hibernate.entity.Customers;
import aze.coders.spring.hibernate.entity.Employer;

import java.util.List;

public interface EmployerDao {
    void save(Employer employer);
    void update(Employer employer);
    void delete(int id);
    Employer findById(int id);
    List<Employer> findByAll();

}
