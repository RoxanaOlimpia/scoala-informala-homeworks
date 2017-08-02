package ro.sci.rentacar1.domain.price;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import ro.sci.rentacar1.domain.calendar.Calendar;
import ro.sci.rentacar1.domain.car.Car;

import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMY;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMYPLUS;
import static ro.sci.rentacar1.domain.car.PriceCategory.HIGHCLASS;

/**
 * Created by Roxana on 7/5/2017.
 */
public class ComputePrice {

    public static final Logger LOGGER = Logger.getLogger("ComputePrice");


    double finalPrice;
    private Calendar calendar;

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }


    Car car = new Car();



    public double computePrice (Car car){
        if (car.getPriceCategory() == ECONOMY){
             finalPrice = 200 * calendar.getNoOfDays();
        }
            else if (car.getPriceCategory() == ECONOMYPLUS){
                    finalPrice = 300 * calendar.getNoOfDays();
        }

            else if (car.getPriceCategory() == HIGHCLASS){
                    finalPrice = 500 * calendar.getNoOfDays();
        }else {
            System.out.println("Price Category not specified");
        }
            System.out.println("The price for the car "+ car.getMake() +" " + car.getModel()+ " for a period of "+ calendar.getNoOfDays() + " days is "+ finalPrice);

        LOGGER.log(Level.INFO,"The price for the car "+ car.getMake() +" " + car.getModel()+ " " +
                " for a period of "+ calendar.getNoOfDays() + " days is "+ finalPrice);
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
