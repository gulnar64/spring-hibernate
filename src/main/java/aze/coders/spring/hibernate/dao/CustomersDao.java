package aze.coders.spring.hibernate.dao;

import aze.coders.spring.hibernate.entity.Customers;

import java.util.List;

public interface CustomersDao extends CrudDao<Customers, Integer>{
    List<Customers> findByName(String name);
}
