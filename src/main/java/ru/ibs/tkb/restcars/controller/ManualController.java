package ru.ibs.tkb.restcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibs.tkb.restcars.entity.Manual;
import ru.ibs.tkb.restcars.service.ManualService;

import java.util.List;

@RestController
@RequestMapping("/api/manual")
public class ManualController {
    private final ManualService manualService;

    @Autowired
    public ManualController(ManualService manualService) {
        this.manualService = manualService;
    }


    @GetMapping("/read")
    public List<Manual> getAll() {
        return manualService.findALl();
    }

    @RequestMapping("/create")
    public void add(@RequestBody Manual manual) {
        manualService.add(manual);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        manualService.delete(id);
    }
}
