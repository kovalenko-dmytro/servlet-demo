package com.kovalenko.service.city;

import com.kovalenko.entity.city.City;
import com.kovalenko.repository.sity.CityRepository;
import com.kovalenko.service.AbstractService;

import javax.annotation.ManagedBean;

@ManagedBean
public class CityService extends AbstractService<City, CityRepository> {

    @Override
    public City update(City entity) {
        return null;
    }
}
