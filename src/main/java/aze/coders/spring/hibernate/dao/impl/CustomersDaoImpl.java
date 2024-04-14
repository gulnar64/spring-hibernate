package aze.coders.spring.hibernate.dao.impl;

import aze.coders.spring.hibernate.dao.CrudDao;
import aze.coders.spring.hibernate.dao.CustomersDao;
import aze.coders.spring.hibernate.entity.Customers;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomersDaoImpl extends CrudDaoImpl<Customers, Integer> implements CustomersDao {
    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customers> findByName(String name) {
        return sessionFactory.getCurrentSession().createQuery("select c from Customers c where c.name=:name ")
                .setParameter("name", name).list();
    }

//    @Override
//    @Transactional
//    public void save(Customers customers) {
//        sessionFactory.getCurrentSession().persist(customers);
//    }
//
//    @Override
//    @Transactional
//    public void update(Customers customers) {
//        sessionFactory.getCurrentSession().merge(customers);
//    }
//
//    @Override
//    @Transactional
//    public void delete(Integer id) {
//        sessionFactory.getCurrentSession().remove(findById(id));
//    }
//
//    @Override
//    @Transactional
//    public Customers findById(Integer id) {
//        return sessionFactory.getCurrentSession().get(Customers.class, id);
//    }
//
//    @Override
//    @Transactional
//    public List<Customers> findByAll() {
//        return sessionFactory.getCurrentSession().createQuery("select c from Customers c").list();
//    }
//
//    @Override
//    @Transactional
//    public List<Customers> findByName(String name) {
//        return sessionFactory.getCurrentSession().createQuery("select c from Customers c where c.name=:name ")
//                .setParameter("name", name).list();
//    }
}
