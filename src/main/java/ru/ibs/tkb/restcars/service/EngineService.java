package ru.ibs.tkb.restcars.service;

import ru.ibs.tkb.restcars.entity.Engine;

import java.util.List;

public interface EngineService {
    List<Engine> findAll();

    void add(Engine engine);

    void delete(long id);
}
