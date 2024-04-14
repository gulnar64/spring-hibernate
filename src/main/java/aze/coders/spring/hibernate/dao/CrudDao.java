package aze.coders.spring.hibernate.dao;

import java.util.List;

public interface CrudDao<E, I> {
    void save(E entity);

    void update(E entity);

    void delete(I id);

    E findById(I id);

    List<E> findByAll();
}
