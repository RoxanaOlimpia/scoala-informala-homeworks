package ro.sci.rentacar1.domain;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Calendar  {

        DateTime pickUpDate;
        DateTime returnDate;

//CONSTRUCTOR implementing EXCEPTION for invalid dates

    public Calendar(DateTime pickUpDate, DateTime returnDate) {
        if (pickUpDate.isAfter(returnDate))
            throw new IllegalArgumentException("The pick up date must be before the return date!");
            this.pickUpDate = pickUpDate;
            this.returnDate = returnDate;
    }


//GETTERS and SETTERS

    public DateTime getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(DateTime pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public DateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(DateTime returnDate) {
        this.returnDate = returnDate;
    }


 //METHOD to CALCULATE THE NO. OF DAYS BETWEEN pick-up date and return date

    public int getNoOfDays(){

        Days noOfDays  = Days.daysBetween(getPickUpDate(), getReturnDate());

        String intValue = noOfDays.toString().replaceAll("[^0-9]", "");

        int noOfDaysInt = Integer.parseInt(intValue);
        if (noOfDaysInt < 1) {
            throw new IllegalArgumentException ("Cars can only be rented for at least one day");
        }
        return noOfDaysInt;
    }

//METHOD that CONVERTS to STRING the objects of type Car
    @Override
    public String toString() {
        return "Calendar{" +
                "pickUpDate=" + pickUpDate +
                ", returnDate=" + returnDate +
                '}';
    }
}