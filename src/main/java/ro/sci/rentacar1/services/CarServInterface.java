package ro.sci.rentacar1.services;

import ro.sci.rentacar1.domain.car.Car;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface CarServInterface<Car> {

//Finds cars by color in the list
    List<Car> findCarsByColor(String color);

//Finds cars by model in the list
    List<Car> findCarsByModel(String model);

//Finds cars by fuel consumption in the list
    List<Car> findCarsByFuelConsumption(double fuelConsumption);

//Finds cars by GPS in the list
    List<Car> findCarsByGps(boolean gps);

//Finds cars by model, number of seats and fuel consumption
    List<Car> findCarsbyModelNumberofSeatsAndFuelConsumption(String model, int numberOfSeats, double fuelConsumption);

}
