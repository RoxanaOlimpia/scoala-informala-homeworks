package ro.sci.rentacar1.domain.price;

import org.joda.time.DateTime;
import org.joda.time.Days;
import ro.sci.rentacar1.domain.calendar.Calendar;
import ro.sci.rentacar1.domain.car.Car;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMY;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMYPLUS;
import static ro.sci.rentacar1.domain.car.PriceCategory.HIGHCLASS;

/**
 * Created by Roxana on 7/5/2017.
 */
public class ComputePrice {

    double finalPrice;
    private Calendar calendar;

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getNoOfDays() throws IllegalArgumentException{

        Days noOfDays  = Days.daysBetween(calendar.getPickUpDate(), calendar.getReturnDate());

        String intValue = noOfDays.toString().replaceAll("[^0-9]", "");

        int noOfDaysInt = Integer.parseInt(intValue);
        if (noOfDaysInt < 1) {
            throw new IllegalArgumentException ("Cars can only be rented for at least one day");
        }
        return noOfDaysInt;
    }


    Car car = new Car();


    public double computePrice (Car car){
        if (car.getPriceCategory() == ECONOMY){
             finalPrice = 200 * getNoOfDays();
        }
            else if (car.getPriceCategory() == ECONOMYPLUS){
                    finalPrice = 300 * getNoOfDays();
        }

            else if (car.getPriceCategory() == HIGHCLASS){
                    finalPrice = 500 * getNoOfDays();
        }else {
            System.out.println("Price Category not specified");
        }
            System.out.println("The price for the car "+ car.getMake() +" " + car.getModel()+ " for a period of "+ getNoOfDays() + " days is "+ finalPrice);

        return finalPrice;
    }

    //contructor
    public ComputePrice() {
    }

    //getter for final price
    public double getFinalPrice() {
        return finalPrice;
    }


}
