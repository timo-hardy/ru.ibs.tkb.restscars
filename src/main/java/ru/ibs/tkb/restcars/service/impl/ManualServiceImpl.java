package ru.ibs.tkb.restcars.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.Manual;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;
import ru.ibs.tkb.restcars.repository.ManualRepository;

import java.util.List;

@Service
public class ManualServiceImpl implements ru.ibs.tkb.restcars.service.ManualService {
    private final ManualRepository manualRepository;

    @Autowired
    public ManualServiceImpl(ManualRepository manualRepository) {
        this.manualRepository = manualRepository;
    }

    @Override
    public List<Manual> findALl() {
        return manualRepository.findAll();
    }

    @Override
    public void add(Manual manual) {
        manualRepository.save(manual);
    }

    @Override
    public void delete(long id) {
        try {
            manualRepository.deleteById(id);
        } catch (Exception e) {
            throw new CarNotFoundException();
        }
    }

}
