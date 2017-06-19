package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.car.Car;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface CarRepoInterface {
    //Adds a new car to the list
     void addCar(Car car);

    //Finds cars by different indicators in the list
     List<Car> findCar();

    //Updates the state of a car
    void updateCar(Car car);

    //Deletes a car
    void deleteCar(Car car);

}
