package ru.ibs.tkb.restcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibs.tkb.restcars.entity.Engine;
import ru.ibs.tkb.restcars.entity.Gears;
import ru.ibs.tkb.restcars.service.EngineService;
import ru.ibs.tkb.restcars.service.GearsService;

import java.util.List;

@RestController
@RequestMapping("/api/gears")
public class GearsController {
    private final GearsService gearsService;

    @Autowired
    public GearsController(GearsService gearsService) {
        this.gearsService = gearsService;
    }

    @GetMapping("/read")
    public List<Gears> getAll () {
        return  gearsService.findAll();
    }

    @RequestMapping("/create")
    public void add(@RequestBody Gears gears) {
        gearsService.add(gears);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        gearsService.delete(id);
    }
}
