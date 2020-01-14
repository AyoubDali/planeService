package com.example.planeservice.Service;

import com.example.planeservice.Model.Plane;
import com.example.planeservice.Repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/PlaneService")
public class PlaneService {

    @Autowired
    PlaneRepository planeRepository;

    @GetMapping(value = "/findAllPlanes")
    public List findPlanes(){
        List planeList = planeRepository.findAll();

        return (planeList);
    }

    @GetMapping(value = "/findPlane/{id}")
    public Plane findPlane(@PathVariable long id){
        Plane plane = planeRepository.findById(id);

        return (plane);
    }

    @PostMapping(value = "/addNewPlane")
    public Plane newPlane(@RequestBody Plane newPlane){
        planeRepository.save(newPlane);
        return newPlane ;
    }

    @DeleteMapping(value = "/deletePlane/{id}")
    public String deletePlane(@PathVariable long id){

        planeRepository.deleteById(id);
        return "OK!" ;
    }

    @PutMapping(value = "/editPlane/{id}")
    public Plane editPlane(@RequestBody Plane planeInfo, @PathVariable long id){

        Plane plane = planeRepository.findById(id);
        plane.setBrand(planeInfo.getBrand());
        planeRepository.save(plane);
        return plane ;
    }
}
