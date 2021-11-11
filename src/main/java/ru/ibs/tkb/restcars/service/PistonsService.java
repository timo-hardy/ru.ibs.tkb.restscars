package ru.ibs.tkb.restcars.service;

import ru.ibs.tkb.restcars.entity.Pistons;

import java.util.List;

public interface PistonsService {
    List<Pistons> findAll();

    void add(Pistons pistons);

    void delete(long id);
}
