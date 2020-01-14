package com.example.planeservice.Repository;

import com.example.planeservice.Model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PlaneRepository extends JpaRepository<Plane,Long> {

    Plane findById(long id);
}
