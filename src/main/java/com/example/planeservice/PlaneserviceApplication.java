package com.example.planeservice;

import com.example.planeservice.Model.Plane;
import com.example.planeservice.Repository.PlaneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class PlaneserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaneserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PlaneRepository  planeRepository){
        return args->{
            Stream.of("Airbus","Turkishairline","airFrance").forEach(dp->{
                planeRepository.save(new Plane((long)0,dp,5000,150,1000,20,30));
            });

            planeRepository.findAll().forEach(System.out::println);

        };
    }
}
