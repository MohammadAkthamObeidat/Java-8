package com.company.sessionone;

import java.util.ArrayList;

@FunctionalInterface
public interface Elect {

    public ArrayList<Car> filter(Elect elect, ArrayList<Car> carsList, String filterVariable);
}
