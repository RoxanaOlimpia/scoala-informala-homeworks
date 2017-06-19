package ro.sci.rentacar1;

import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.repository.CarRepo;
import ro.sci.rentacar1.services.CarServ;

import java.util.List;

import static ro.sci.rentacar1.domain.car.FuelType.DIESEL;
import static ro.sci.rentacar1.domain.car.FuelType.HYBRID;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Main {
    public static void main (String[] args){
        System.out.println("Opening Rent a Car application");

       //Creating objects of type Car with parameters
        Car volvo = new Car();
        Car bmw = new Car();
        Car volkswagen = new Car();
        Car bmw2 = new Car("BMW","300",HYBRID,"red",4,true);

        //Creating a Repository for objects of type Car
        CarRepo carRepo = new CarRepo();

        //Adding the created objects to the carRepo
        carRepo.addCar(volvo);
        carRepo.addCar (bmw);
        carRepo.addCar (volkswagen);
        carRepo.addCar(bmw2);

        //Setting paramentres for the instantiated cars
        volvo.setMake("Volvo");
        volvo.setModel("v3");
        volvo.setColor("red");
        volvo.setFuelConsumption(4.05);

        bmw.setMake("BMW");
        bmw.setColor("black");
        bmw.setModel("m5");

        volkswagen.setMake("Volkswagen");
        volkswagen.setColor("grey");
        volkswagen.setModel("Passat");

        bmw2.setColor("purple");

        //Displaying a list of all cars from the carRepo
        System.out.println("The cars from the list are: ");
            for (Car car: carRepo.getCarRepoList()){
                System.out.println(car.getMake()+" " + car.getModel());
            }

        System.out.println("___________________________________________________________");

        //Displaying all red cars from the list
        CarServ searchByColor = new CarServ(carRepo);
        List<Car>findCarsByColor = searchByColor.findCarsByColor("red");
        System.out.println("The red cars are: ");
            for (Car car: findCarsByColor){
                System.out.println(car.getMake()+ " " + car.getModel());
            }

        carRepo.deleteCar(bmw2);

        System.out.println("___________________________________________________________");
        System.out.println("The cars from the list are: ");
        for (Car car: carRepo.getCarRepoList()){
            System.out.println(car.getMake()+" " + car.getModel());
        }

    }


}
