package ro.sci.rentacar1.domain.car;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Car {
    private String make;
    private String model;
    private FuelType fuelType;
    private String color;
    private int numberOfSeats;
    private boolean gps;
    private boolean automaticGearbox;
    private double fuelConsumption;

    //constructors
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, FuelType fuelType, String color, int numberOfSeats, boolean gps) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.gps = gps;
    }

    public Car (){

    }

    //getters and setters
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
}
