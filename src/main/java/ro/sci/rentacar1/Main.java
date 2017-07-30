package ro.sci.rentacar1;

import org.joda.time.DateTime;
import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.domain.price.ComputePrice;
import ro.sci.rentacar1.repository.CarRepo;
import ro.sci.rentacar1.services.CarServ;
import ro.sci.rentacar1.domain.calendar.Calendar;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static ro.sci.rentacar1.domain.car.FuelType.HYBRID;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMY;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMYPLUS;
import static ro.sci.rentacar1.domain.car.PriceCategory.HIGHCLASS;

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
        Car bmw2 = new Car("BMW","300",HYBRID,"red",4,true, HIGHCLASS);

        //Creating a Repository for objects of type Car
        CarRepo<Car> carRepo = new CarRepo<Car>();

        //Adding the created objects to the carRepo
        carRepo.add(volvo);
        carRepo.add (bmw);
        carRepo.add (volkswagen);
        carRepo.add(bmw2);

        //Setting paramentres for the instantiated cars
        volvo.setMake("Volvo");
        volvo.setModel("v3");
        volvo.setColor("red");
        volvo.setFuelConsumption(4.05);

        bmw.setMake("BMW");
        bmw.setColor("black");
        bmw.setModel("m5");

        volkswagen.setMake("Volkswagen");
        volkswagen.setColor("green");
        volkswagen.setModel("Passat");

        bmw2.setColor("purple");

        volkswagen.setPriceCategory(ECONOMYPLUS);
        volvo.setPriceCategory(ECONOMY);
        bmw.setPriceCategory(HIGHCLASS);

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

        carRepo.delete(bmw2);

        System.out.println("___________________________________________________________");
        System.out.println("The cars from the list are: ");
        for (Car car: carRepo.getCarRepoList()){
            System.out.println(car.getMake()+" " + car.getModel());
        }

        System.out.println("___________________________________________________________");

        //Calculating price for cars

        Calendar calendar1 = new Calendar();
        calendar1.setPickUpDate(new DateTime(2017,05,12,00,00));
        calendar1.setReturnDate(new DateTime (2017,05, 28, 00,00));

        ComputePrice computePrice = new ComputePrice();
        computePrice.setCalendar(calendar1);
        computePrice.computePrice(volvo);


        Calendar calendar2 = new Calendar();
        calendar2.setPickUpDate(new DateTime(2017, 04, 12, 00, 00));
        calendar2.setReturnDate(new DateTime(2017, 04, 12, 00,00));

        computePrice.setCalendar(calendar2);
        computePrice.computePrice(volvo);

        computePrice.setCalendar(calendar2);
        computePrice.computePrice(bmw);


    }


}
