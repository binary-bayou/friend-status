package com.binarybayou.ras;

import com.binarybayou.domains.User;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
public interface IResourceAccessor<T> {
    T find(Long id);

    Iterable<T> findAll();

    Long add(T entity);

    User update(T entity);

    void delete(Long id);
}
