package ru.ibs.tkb.restcars.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "STEERINGS")
public class SteeringWheel {
    @Id
    @GeneratedValue
    private Long SteeringId;
    private String typeSteeringWheel;
}
