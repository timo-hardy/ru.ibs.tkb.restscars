package ru.ibs.tkb.restcars.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SteeringWheel {
    @Id
    @GeneratedValue
    private Long id;
    private String typeSteeringWheel;
}
