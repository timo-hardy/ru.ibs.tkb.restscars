package ru.ibs.tkb.restcars.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "GEARS")
public class Gears {
    @Id
    @GeneratedValue
    private Long gearsId;
    private String size;
}
