package com.company;
import com.company.sessionone.Car;
import com.company.sessionone.CarUtil;
import com.company.sessionone.Elect;

import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {
        CarUtil.fillCars();

        ArrayList<Car> result = new ArrayList<>();

        // Anonymous class.
        Elect elect = new Elect() {
            @Override
            public ArrayList<Car> filter(Elect elect, ArrayList<Car> carsList, String color) {
                for (Car car : carsList){
                    if(car.getColor().equals(color))
                        result.add(car);
                }
                return result;
            }
        };

        // Lambda Expression
        Elect elect2 = ((Elect electt, ArrayList<Car> carss, String model)-> {
            for (Car car : CarUtil.getCarsList()) {
                if (car.getModel().equals(model)) {
                    result.add(car);
                }
            }
                return result;
        });



        System.out.println(elect.filter(elect, CarUtil.getCarsList(), "Red"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(elect2.filter(elect, CarUtil.getCarsList(), "BMW"));
        System.out.println();
        System.out.println();
        System.out.println();


        // Remove IF
        CarUtil.getCarsList().removeIf(car -> car.getModel().equals("BMW"));
        System.out.println(CarUtil.getCarsList());
        System.out.println();
        System.out.println();
        System.out.println();
        // Foreach
        CarUtil.getCarsList().forEach(car -> System.out.println(car.getModel()));

    }
}
