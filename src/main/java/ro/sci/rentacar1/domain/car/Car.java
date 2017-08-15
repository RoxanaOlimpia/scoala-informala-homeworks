package ro.sci.rentacar1.domain.car;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import ro.sci.rentacar1.domain.Calendar;

import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMY;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMYPLUS;
import static ro.sci.rentacar1.domain.car.PriceCategory.HIGHCLASS;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Car {

    public static final Logger LOGGER = Logger.getLogger("ComputePrice");

    private String make;
    private String model;
    private FuelType fuelType;
    private String color;
    private int numberOfSeats;
    private boolean gps;
    private boolean automaticGearbox;
    private double fuelConsumption;
    private PriceCategory priceCategory;
    private CarState carState;
    private int price;


//CONSTRUCTOR without parameters

    public Car (){
    }

//CONSTRUCTORS with parameters

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, FuelType fuelType, String color,
               int numberOfSeats, boolean gps, PriceCategory priceCategory) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.gps = gps;
        this.priceCategory = priceCategory;
    }

//GETTERS and SETTERS

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {return numberOfSeats;}

    public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isAutomaticGearbox() {
        return automaticGearbox;
    }

    public void setAutomaticGearbox(boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public PriceCategory getPriceCategory() {return priceCategory;}

    public void setPriceCategory(PriceCategory priceCategory) {this.priceCategory = priceCategory;}

    public CarState getCarState(CarState carState) {
        return carState;
    }

    public void setCarState(CarState carState) {this.carState = carState;}

    public CarState getCarState() {return carState;}

    public int getPrice() {return price;}


//METHOD to check the AVAILABILITY of a CAR

    public boolean getCarAvailability(Car car){
        if (carState == CarState.AVAILABLE){
            System.out.println("The car is available for the selected period");
            return true;
        }else{
            System.out.println("The car is NOT available for the selected period");
            return false;
        }
    }

//METHOD to compute the PRICE for a car taking into consideration the car's PRICE CATEGORY and the RENTAL PERIOD
    public int computePrice (Car car, Calendar calendar){
        if (car.getPriceCategory() == ECONOMY){
            price = 200 * calendar.getNoOfDays();
        }
        else if (car.getPriceCategory() == ECONOMYPLUS){
            price = 300 * calendar.getNoOfDays();
        }

        else if (car.getPriceCategory() == HIGHCLASS){
            price = 500 * calendar.getNoOfDays();
        }else {
            throw new IllegalArgumentException ("The price category for the chosen car is not specified in the system");
        }

//LOGGER to display INFO about the calculated price for a specific car for a certain rental period
        LOGGER.log(Level.INFO,"The calculated price for the car "+ car.getMake() +" " + car.getModel()+ " " +
                " for a period of "+ calendar.getNoOfDays() + " days is "+ price);

        return price;
    }

//METHOD that CONVERTS to STRING the objects of type Car

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fuelType=" + fuelType +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", gps=" + gps +
                ", automaticGearbox=" + automaticGearbox +
                ", fuelConsumption=" + fuelConsumption +
                ", priceCategory=" + priceCategory +
                ", carState=" + carState +
                '}';
    }
}
