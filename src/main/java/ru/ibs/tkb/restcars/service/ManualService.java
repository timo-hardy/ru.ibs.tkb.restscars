package ru.ibs.tkb.restcars.service;

import ru.ibs.tkb.restcars.entity.Manual;

import java.util.List;

public interface ManualService {

    List<Manual> findALl();

    void add(Manual manual);

    void delete(long id);
}
