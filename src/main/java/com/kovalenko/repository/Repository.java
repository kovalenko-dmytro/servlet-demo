package com.kovalenko.repository;

import com.kovalenko.entity.AbstractEntity;

import java.util.List;

public interface Repository<E extends AbstractEntity> {

    List<E> find();
    E find(long id);
    E save(E entity);
    E update(E entity);
    void delete(long id);
}
