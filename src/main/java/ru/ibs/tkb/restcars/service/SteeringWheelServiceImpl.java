package ru.ibs.tkb.restcars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.SteeringWheel;
import ru.ibs.tkb.restcars.repository.SteeringWheelRepository;

import java.util.List;

@Service
public class SteeringWheelServiceImpl {
    private final SteeringWheelRepository steeringWheelRepository;

    @Autowired
    public SteeringWheelServiceImpl(SteeringWheelRepository steeringWheelRepository) {
        this.steeringWheelRepository = steeringWheelRepository;
    }

    public List<SteeringWheel> findAll() {
        return steeringWheelRepository.findAll();
    }

    public void add(SteeringWheel steeringWheel) {
        steeringWheelRepository.save(steeringWheel);
    }

    public void delete(long id) {
        steeringWheelRepository.deleteById(id);
    }
}
