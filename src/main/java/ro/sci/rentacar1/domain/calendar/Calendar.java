package ro.sci.rentacar1.domain.calendar;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Calendar {
    private PickUpTime pickUpTime;
    private ReturnTime returnTime;

    //constructor
    public Calendar(PickUpTime pickUpTime, ReturnTime returnTime) {
        this.pickUpTime = pickUpTime;
        this.returnTime = returnTime;
    }

    //getters and setters


    public PickUpTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(PickUpTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public ReturnTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(ReturnTime returnTime) {
        this.returnTime = returnTime;
    }
}
