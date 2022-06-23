package com.example.model.controller;


import com.example.model.model.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

        @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List<Car> getCars(Model model){
            // Request all cars
            List<Car> carList = new ArrayList<Car>();
            carList.add(new Car("Ford","Scape", 10000f,"grey", 100000 ));
            carList.add(new Car("Kia","Sorento", 20000f,"grey", 100000 ));
            return carList;
        }
}
