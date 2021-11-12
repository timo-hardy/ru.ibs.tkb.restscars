package ru.ibs.tkb.restcars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AUTO")
public class Car {
    @Id
    @GeneratedValue
    private Long carId;
    private String mnfName;
    private String modelName;

    @OneToOne(cascade = CascadeType.ALL)
    Engine engine;
    @OneToOne(cascade = CascadeType.ALL)
    SteeringWheel steeringWheel;
}
