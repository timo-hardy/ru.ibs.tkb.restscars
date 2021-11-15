package ru.ibs.tkb.restcars.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.tkb.restcars.entity.Car;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;
import ru.ibs.tkb.restcars.repository.CarRepository;
import ru.ibs.tkb.restcars.service.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        try {
            carRepository.save(car);
        } catch (Exception e) {
            throw new CarNotFoundException();
        }
    }

    @Override
    public void delete(long id) {
        try {
        carRepository.deleteById(id);
        } catch (Exception e) {
            throw new CarNotFoundException();
        }
    }
}
