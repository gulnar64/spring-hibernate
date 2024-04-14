package aze.coders.spring.hibernate.dao.impl;

import aze.coders.spring.hibernate.dao.CrudDao;

import java.util.List;

public class CrudDaoImpl<E,I> implements CrudDao<E,I> {
    @Override
    public void save(E entity) {

    }

    @Override
    public void update(E entity) {

    }

    @Override
    public void delete(I id) {

    }

    @Override
    public E findById(I id) {
        return null;
    }

    @Override
    public List<E> findByAll() {
        return null;
    }
}
