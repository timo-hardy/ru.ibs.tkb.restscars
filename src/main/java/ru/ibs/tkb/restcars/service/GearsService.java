package ru.ibs.tkb.restcars.service;

import ru.ibs.tkb.restcars.entity.Gears;

import java.util.List;

public interface GearsService {
    List<Gears> findAll();

    void add(Gears gears);

    void delete(long id);
}
