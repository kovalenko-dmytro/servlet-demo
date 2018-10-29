package com.kovalenko.repository;

import com.kovalenko.entity.AbstractEntity;

import java.util.List;

public abstract class AbstractRepository<E extends AbstractEntity> implements Repository<E> {

    @Override
    public List<E> find() {
        return null;
    }

    @Override
    public E find(long id) {
        return null;
    }

    @Override
    public E save(E entity) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
