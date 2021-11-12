package ru.ibs.tkb.restcars.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Target;

@Data
@Entity
@Table(name = "PISTONS")
public class Pistons {
    @Id
    @GeneratedValue
    private Long pistonsId;
    private String material;
}
