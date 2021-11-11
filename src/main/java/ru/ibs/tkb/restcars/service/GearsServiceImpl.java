package ru.ibs.tkb.restcars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.Gears;
import ru.ibs.tkb.restcars.repository.GearsRepository;

import java.util.List;

@Service
public class GearsServiceImpl implements GearsService {
    private final GearsRepository gearsRepository;

    @Autowired
    public GearsServiceImpl(GearsRepository gearsRepository) {
        this.gearsRepository = gearsRepository;
    }

    @Override
    public List<Gears> findAll() {
        return gearsRepository.findAll();
    }

    @Override
    public void add(Gears gears) {
        gearsRepository.save(gears);
    }

    @Override
    public void delete(long id) {
        gearsRepository.deleteById(id);
    }
}