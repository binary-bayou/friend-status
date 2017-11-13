package com.binarybayou.managers;

import java.util.List;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
public interface IManager<T> {

    T get(Long id);

    List<T> getAll();

    Long add(T view);

    Long update(T view);

    void delete(Long id);
}
