package ru.ibs.tkb.restcars.service;

import ru.ibs.tkb.restcars.entity.SteeringWheel;

import java.util.List;

public interface SteeringWheelService {
    List<SteeringWheel> findAll();

    void add(SteeringWheel steeringWheel);

    void delete(long id);
}
