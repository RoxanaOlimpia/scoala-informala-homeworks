package ro.sci.rentacar1.domain.calendar;


import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Calendar  {

        DateTime pickUpDate;
        DateTime returnDate;


    //constructors
    public Calendar(DateTime pickUpDate, DateTime returnDate) {
        if (pickUpDate.isAfter(returnDate))
            throw new IllegalArgumentException("The pick up date must be before the return date!");
            this.pickUpDate = pickUpDate;
            this.returnDate = returnDate;
    }




    //getters and setters


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

    public int getNoOfDays(){

        Days noOfDays  = Days.daysBetween(getPickUpDate(), getReturnDate());

        String intValue = noOfDays.toString().replaceAll("[^0-9]", "");

        int noOfDaysInt = Integer.parseInt(intValue);
        if (noOfDaysInt < 1) {
            throw new IllegalArgumentException ("Cars can only be rented for at least one day");
        }
        return noOfDaysInt;
    }
}