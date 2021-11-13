package ru.ibs.tkb.restcars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.SteeringWheel;
import ru.ibs.tkb.restcars.exception.SteeringWheelNotFoundException;
import ru.ibs.tkb.restcars.repository.SteeringWheelRepository;

import java.util.List;

@Service
public class SteeringWheelServiceImpl implements SteeringWheelService {
    private final SteeringWheelRepository steeringWheelRepository;

    @Autowired
    public SteeringWheelServiceImpl(SteeringWheelRepository steeringWheelRepository) {
        this.steeringWheelRepository = steeringWheelRepository;
    }

    @Override
    public List<SteeringWheel> findAll() {
        return steeringWheelRepository.findAll();
    }

    @Override
    public void add(SteeringWheel steeringWheel) {
        steeringWheelRepository.save(steeringWheel);
    }

    @Override
    public void delete(long id) {
        try {
            steeringWheelRepository.deleteById(id);
        } catch (Exception e) {
            throw new SteeringWheelNotFoundException();
        }
    }
}
