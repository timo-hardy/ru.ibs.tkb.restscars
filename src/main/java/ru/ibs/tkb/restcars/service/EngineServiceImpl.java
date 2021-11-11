package ru.ibs.tkb.restcars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.Engine;
import ru.ibs.tkb.restcars.repository.EngineRepository;

import java.util.List;

@Service
public class EngineServiceImpl implements EngineService {
    private final EngineRepository engineRepository;

    @Autowired
    public EngineServiceImpl(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    @Override
    public List<Engine> findAll() {
        return engineRepository.findAll();
    }

    @Override
    public void add(Engine engine) {
        engineRepository.save(engine);
    }

    @Override
    public void delete(long id) {
        engineRepository.deleteById(id);
    }
}
