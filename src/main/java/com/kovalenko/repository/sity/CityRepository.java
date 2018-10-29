package com.kovalenko.repository.sity;

import com.kovalenko.entity.city.City;
import com.kovalenko.repository.AbstractRepository;

import javax.annotation.ManagedBean;

@ManagedBean
public class CityRepository extends AbstractRepository<City> {

    @Override
    public City update(City entity) {
        return null;
    }
}
