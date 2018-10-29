package com.kovalenko.service;

import com.kovalenko.entity.AbstractEntity;
import com.kovalenko.repository.Repository;

import javax.inject.Inject;
import java.util.List;

public abstract class AbstractService<E extends AbstractEntity, R extends Repository<E>> implements Service<E> {

    @Inject
    protected R repository;

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
