package ro.sci.rentacar1.domain;

import org.joda.time.DateTime;
import ro.sci.rentacar1.domain.calendar.Calendar;
import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.domain.costumer.Costumer;
import ro.sci.rentacar1.domain.price.ComputePrice;

/**
 * Created by Roxana on 8/2/2017.
 */
public class Transaction {
    private int id;
    private Car car;
    private Costumer costumer;
    private int numberOfDays;
    private int price;
    private boolean status;


    ComputePrice computePrice = new ComputePrice();
    Calendar calendar = new Calendar(new DateTime(), new DateTime() );

    public Transaction(int id, Car car, Costumer costumer, int price) {
        this.id = id;
        this.car = car;
        this.costumer = costumer;
        this.price = price;
    }

    public boolean gettingTransactionStatus(int payment) {
        if (payment == price) {
            status = true;
            System.out.println("Transaction id: " + getId() + "declined");
        } else {
            status = false;
            System.out.println("Transaction id: " + getId() + "approved");
        }return status;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public int getId() {
        return id;
    }

}
