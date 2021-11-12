package ru.ibs.tkb.restcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibs.tkb.restcars.entity.Car;
import ru.ibs.tkb.restcars.entity.Engine;
import ru.ibs.tkb.restcars.service.CarService;
import ru.ibs.tkb.restcars.service.EngineService;

import java.util.List;

@RestController
@RequestMapping("/api/engine")
public class EnigneController {
    private final EngineService engineService;

    @Autowired
    public EnigneController(EngineService engineService) {
        this.engineService = engineService;
    }

    @GetMapping("/read")
    public List<Engine> getAll () {
        return  engineService.findAll();
    }

    @RequestMapping("/create")
    public void add(@RequestBody Engine engine) {
        engineService.add(engine);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        engineService.delete(id);
    }
}
