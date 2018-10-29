package com.kovalenko.entity.city;

import com.kovalenko.entity.AbstractEntity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class City extends AbstractEntity {

    private String name;
    private int population;

    @Builder
    public City(long id, String name, int population) {
        super(id);
        this.name = name;
        this.population = population;
    }
}
