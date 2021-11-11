package ru.ibs.tkb.restcars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AUTOS")
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "MANUFACTURE")
    private String mnfName;
    @Column(name = "MODEL")
    private String modelName;
}
