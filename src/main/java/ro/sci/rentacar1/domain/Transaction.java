package ro.sci.rentacar1.domain;

import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.domain.car.CarState;
import ro.sci.rentacar1.domain.customer.Customer;


/**
 * Created by Roxana on 8/2/2017.
 */
public class Transaction {
    private int id;
    private Car car;
    private Customer customer;
    private Calendar calendar;
    private int rentalDays;
    private int price;
    private int payment;
    private boolean status;


//CONSTRUCTOR with parameters

    public Transaction(int id, Car car, Customer customer, Calendar calendar, int payment) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.calendar = calendar;
        this.payment = payment;
        this.rentalDays = calendar.getNoOfDays();
        this.price = car.computePrice(car, calendar);
        this.status = getStatus();
    }

//GETTERS and SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getPrice() {
        return price;
    }


//METHOD to get the STATUS of a transaction when the payment is introduced

    public boolean getStatus() {
        if (payment == price && car.getCarAvailabilityForPeriod(car)) {
            status = true;
            car.setCarState(CarState.BOOKED);
            System.out.println("Transaction id: " + getId() + " approved");
        } else {
            status = false;
            System.out.println("Transaction id: " + getId() + " declined");
            throw new IllegalArgumentException("The selected car is not available for the mentioned period or the payment is not correct.");
        }
        return status;
    }
}