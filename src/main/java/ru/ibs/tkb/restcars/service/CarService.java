package ru.ibs.tkb.restcars.service;

import ru.ibs.tkb.restcars.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> findAll();

    void add(Car car);

    void delete(long id);
}
