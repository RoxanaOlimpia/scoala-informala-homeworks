package ro.sci.rentacar1.domain.calendar;


import org.joda.time.DateTime;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Calendar  {

        DateTime pickUpDate;
        DateTime returnDate;


    //constructors
    public Calendar(DateTime pickUpDate, DateTime returnDate) {
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
    }

    public Calendar() {
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
}