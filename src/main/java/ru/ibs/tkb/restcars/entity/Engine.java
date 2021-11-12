package ru.ibs.tkb.restcars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ENGINES")
public class Engine {
    @Id
    @GeneratedValue
    private Long engineId;
    private String engineType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Gears> gears;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pistons> pistons;
}
