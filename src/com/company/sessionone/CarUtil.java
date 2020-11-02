package com.company.sessionone;

import java.util.ArrayList;
import java.util.UUID;

public class CarUtil {

   static ArrayList<Car> newCars = new ArrayList<>();

    public static void fillCars(){

        newCars.add(new Car(UUID.randomUUID(),"Red", "BMW"));
        newCars.add(new Car(UUID.randomUUID(),"Black", "Tesla"));
        newCars.add(new Car(UUID.randomUUID(),"Silver", "Mercedes"));
        newCars.add(new Car(UUID.randomUUID(),"Red", "Ford"));
        newCars.add(new Car(UUID.randomUUID(),"Dark Blue", "BMW"));
        newCars.add(new Car(UUID.randomUUID(),"Red", "Toyota"));
        newCars.add(new Car(UUID.randomUUID(),"Red", "Ferrari"));
        newCars.add(new Car(UUID.randomUUID(),"Yellow", "Mercedes"));
        newCars.add(new Car(UUID.randomUUID(),"Black", "BMW"));
        newCars.add(new Car(UUID.randomUUID(),"Black", "Mercedes"));
        newCars.add(new Car(UUID.randomUUID(),"Silver", "Audi"));
        newCars.add(new Car(UUID.randomUUID(),"Yellow", "Audi"));
        newCars.add(new Car(UUID.randomUUID(),"Silver", "Ford"));
    }

    public static ArrayList<Car> getCarsList(){
        return newCars;
    }
}
