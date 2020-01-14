package com.example.planeservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private int maxWeight;
    private int flyHours;
    private int Speed;
    private int nbPlacesB;
    private int nbPlacesE;


}
