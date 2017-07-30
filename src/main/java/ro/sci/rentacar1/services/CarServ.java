package ro.sci.rentacar1.services;

import java.util.ArrayList;
import java.util.List;
import ro.sci.rentacar1.repository.CarRepo;
import ro.sci.rentacar1.domain.car.Car;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CarServ implements CarServInterface<Car>{

    private CarRepo<Car> carRepoList;
    public CarServ (CarRepo<Car> carRepoList){
        this.carRepoList = carRepoList;
    }


    public List<Car> findCarsByColor(String color) {
        List<Car>foundCarsByColor = new ArrayList<Car>();
        for (Car car: carRepoList.getCarRepoList()){
            if(car.getColor().equals(color)){
                foundCarsByColor.add(car);
            }
        }
        return foundCarsByColor;
    }

    public List<Car> findCarsByModel(String model) {
        List<Car>foundCarsByModel=new ArrayList<Car>();
        for (Car cars: carRepoList.getCarRepoList()){
            if(cars.getModel().equals(model)){
                foundCarsByModel.add(cars);
            }
        }
        return foundCarsByModel;
    }

    public List<Car> findCarsByFuelConsumption(double fuelConsumption) {
        List<Car>foundCarsByFuelConsumption=new ArrayList<Car>();
        for (Car cars: carRepoList.getCarRepoList()){
            if(cars.getFuelConsumption()== fuelConsumption){
                foundCarsByFuelConsumption.add(cars);

            }
        }
        return foundCarsByFuelConsumption;
    }

    public List<Car> findCarsByGps(boolean gps) {
        List<Car>foundCarsByGps=new ArrayList<Car>();
        for (Car cars: carRepoList.getCarRepoList()){
            if (cars.isGps()== gps){
                foundCarsByGps.add(cars);
            }
        }
        return foundCarsByGps;
    }

    public List<Car> findCarsbyModelNumberofSeatsAndFuelConsumption(String model, int numberOfSeats, double fuelConsumption) {
        List<Car>foundCarsByModelNumberOfSeatsAndFuelConsumption=new ArrayList<Car>();
        for (Car cars: carRepoList.getCarRepoList()){
            if(cars.getModel().equals(model)&&(cars.getNumberOfSeats()== numberOfSeats)&&(cars.getFuelConsumption()==fuelConsumption)){
                foundCarsByModelNumberOfSeatsAndFuelConsumption.add(cars);
            }
        }
        return foundCarsByModelNumberOfSeatsAndFuelConsumption;
    }



}
