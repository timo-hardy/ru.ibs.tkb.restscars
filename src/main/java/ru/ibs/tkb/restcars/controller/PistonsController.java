package ru.ibs.tkb.restcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;
import ru.ibs.tkb.restcars.entity.Pistons;
import ru.ibs.tkb.restcars.service.PistonsService;

import java.util.List;

@RestController
@RequestMapping("/api/pisotons")
public class PistonsController {
    private final PistonsService pistonsService;

    @Autowired
    public PistonsController(PistonsService pistonsService) {
        this.pistonsService = pistonsService;
    }

    @GetMapping("/read")
    public List<Pistons> getAll() {
        return pistonsService.findAll();
    }

    @RequestMapping("/create")
    public void add(@RequestBody Pistons pistons) {
        pistonsService.add(pistons);
    }

    @DeleteMapping( "/delete/{id}")
    public void delete(@PathVariable long id){
        pistonsService.delete(id);
    }
}

