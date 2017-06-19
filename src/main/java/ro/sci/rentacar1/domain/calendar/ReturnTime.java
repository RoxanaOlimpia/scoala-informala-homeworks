package ro.sci.rentacar1.domain.calendar;

/**
 * Created by Roxana on 6/17/2017.
 */
public class ReturnTime {
    private int rhour;
    private int rday;
    private String rmonth;
    private int ryear;

    //constructor
    public ReturnTime(int rhour, int rday, String rmonth, int ryear) {
        this.rhour = rhour;
        this.rday = rday;
        this.rmonth = rmonth;
        this.ryear = ryear;
    }

    //getters and setters
    public int getRhour(){
        return rhour;
    }

    public void setRhour(){
        this.rhour = rhour;
    }

    public int getRday(){
        return rday;
    }

    public void setRday(int rday){
        this.rday = rday;

    }

    public String getRmonth(){
        return rmonth;
    }

    public void setRmonth(){
        this.rmonth = rmonth;
    }

    public int getRyear(){
        return ryear;
    }

    public void setRyear(){
        this.ryear = ryear;
    }

}
