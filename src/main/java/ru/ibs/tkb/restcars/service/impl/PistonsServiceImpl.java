package ru.ibs.tkb.restcars.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.Pistons;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;
import ru.ibs.tkb.restcars.repository.PistonsRepository;
import ru.ibs.tkb.restcars.service.PistonsService;

import java.util.List;

@Service
public class PistonsServiceImpl implements PistonsService {
    private final PistonsRepository pistonsRepository;

    @Autowired
    public PistonsServiceImpl(PistonsRepository pistonsRepository) {
        this.pistonsRepository = pistonsRepository;
    }

    @Override
    public List<Pistons> findAll() {
        return pistonsRepository.findAll();
    }

    @Override
    public void add(Pistons pistons) {
        pistonsRepository.save(pistons);
    }

    @Override
    public void delete(long id) {
        try {
            pistonsRepository.deleteById(id);
        } catch (Exception e) {
            throw new CarNotFoundException();
        }
    }
}
