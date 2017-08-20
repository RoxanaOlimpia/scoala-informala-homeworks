package ro.sci.rentacar1.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CarRepo <Car> implements RepoInterface<Car> {

    public List<Car> carRepoList = new ArrayList<Car>();

//CONSTRUCTOR without parameter
    public CarRepo() {
    }

//CONSTRUCTOR with parameter
    public CarRepo(List<Car> carRepoList) {
        this.carRepoList = carRepoList;
    }

//GETTER for the car list
    public List<Car> getCarRepoList() {
        return carRepoList;
    }


//Implementation of CRUD methods

    @Override
    public void add(Car car) {carRepoList.add(car);}

    @Override
    public List<Car> find() {
        return carRepoList;
    }

    @Override
    public void update(Car car) {
        carRepoList.set(carRepoList.indexOf(carRepoList), car);
    }

    @Override
    public void delete(Car car) {
        carRepoList.remove(car);
    }

}
