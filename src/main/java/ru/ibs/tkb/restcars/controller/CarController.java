package ru.ibs.tkb.restcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibs.tkb.restcars.entity.Car;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;
import ru.ibs.tkb.restcars.exceptionhandler.CarNotFoundExceptionHandler;
import ru.ibs.tkb.restcars.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/read")
    public List<Car> getAll() {
            return carService.findAll();
    }

    @RequestMapping("/create")
    public void add(@RequestBody Car car) {
        carService.add(car);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws CarNotFoundException{
        carService.delete(id);
    }
}
