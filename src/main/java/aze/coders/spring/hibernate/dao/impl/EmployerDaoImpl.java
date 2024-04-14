//package aze.coders.spring.hibernate.dao.impl;
//
//import aze.coders.spring.hibernate.dao.EmployerDao;
//import aze.coders.spring.hibernate.entity.Customers;
//import aze.coders.spring.hibernate.entity.Employer;
//import lombok.RequiredArgsConstructor;
//import org.hibernate.SessionFactory;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class EmployerDaoImpl implements EmployerDao {
//    private final SessionFactory sessionFactory;
//    @Override
//    @Transactional
//    public void save(Employer employer) {
//        sessionFactory.getCurrentSession().persist(employer);
//
//    }
//
//    @Override
//    public void update(Employer employer) {
//
//    }
//
//    @Override
//    public void delete(Integer id) {
//
//    }
//
//    @Override
//    @Transactional
//    public Employer findById(Integer id) {
//        return sessionFactory.getCurrentSession().get(Employer.class, id);
//    }
//
//    @Override
//    public List<Employer> findByAll() {
//        return null;
//    }
//}
