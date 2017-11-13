package com.binarybayou.ras;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
public interface IResourceAccessor<T> {
    T find(Long id);

    Iterable<T> findAll();

    Long add(T entity);

    Long update(T entity);

    void delete(Long id);
}
