package com.example.androkado.database.daos;

import com.example.androkado.database.base.DbEntity;

public interface BaseDAO<T extends DbEntity> {

    T select(Long id);
    boolean update(T item);
    boolean delete(Long id);
    T insert(T item);
}
