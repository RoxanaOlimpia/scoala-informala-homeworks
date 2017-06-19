package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CarRepo implements CarRepoInterface {

    public List<Car> carRepoList = new ArrayList<Car>();

    //constructor
    public CarRepo(List<Car> carRepoList) {
        this.carRepoList = carRepoList;
    }

    public CarRepo() {
    }

    //getter
    public List<Car> getCarRepoList() {
        return carRepoList;
    }


    //methods
    public void addCar(Car car) {
        carRepoList.add(car);

    }

    public List<Car>findCar() {
        return carRepoList;

    }

    public void updateCar(Car car) {
        carRepoList.set(carRepoList.indexOf(carRepoList), car);

    }

    public void deleteCar(Car car) {
        carRepoList.remove(car);

    }
}
