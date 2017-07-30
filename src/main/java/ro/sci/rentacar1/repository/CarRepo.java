package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CarRepo <Car> implements RepoInterface<Car> {

    public List<Car> carRepoList = new ArrayList<Car>();

    //Car REPOLIST constructors:
    public CarRepo(List<Car> carRepoList) {
        this.carRepoList = carRepoList;
    }

    public CarRepo() {
    }

    //Car LIST Getter:
    public List<Car> getCarRepoList() {
        return carRepoList;
    }

    //Methods:

    @Override
    public void add(Car car) {
        carRepoList.add(car);

    }

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
