package ru.ibs.tkb.restcars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Gears> gears;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pistons> pistons;
}
