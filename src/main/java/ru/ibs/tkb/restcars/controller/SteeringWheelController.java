package ru.ibs.tkb.restcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibs.tkb.restcars.entity.SteeringWheel;
import ru.ibs.tkb.restcars.service.SteeringWheelService;

import java.util.List;

@RestController
@RequestMapping("/api/steering")
public class SteeringWheelController {

    private final SteeringWheelService steeringWheelService;

    @Autowired
    public SteeringWheelController(SteeringWheelService steeringWheelService) {
        this.steeringWheelService = steeringWheelService;
    }

    @GetMapping("/read")
    public List<SteeringWheel> getAll() {
        return steeringWheelService.findAll();
    }

    @RequestMapping("/create")
    public void add(@RequestBody SteeringWheel steeringWheel) {
        steeringWheelService.add(steeringWheel);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        steeringWheelService.delete(id);
    }
}
