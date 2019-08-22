package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... string) throws Exception{
        Car car;
        car = new Car(2019,"Porsche","Carrena");
        repository.save(car);

        car=new Car(2020,"Mercedes", "Benz");
        repository.save(car);

        car=new Car(2020,"Tesla", "x");
        repository.save(car);


    }
}
