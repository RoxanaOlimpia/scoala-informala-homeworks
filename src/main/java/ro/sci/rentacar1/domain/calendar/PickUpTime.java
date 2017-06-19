package ro.sci.rentacar1.domain.calendar;

/**
 * Created by Roxana on 6/17/2017.
 */
public class PickUpTime {
    private int hour;
    private int day;
    private String month;
    private int year;


    //constructor
    public PickUpTime(int hour, int day, String month, int year) {
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters and setters
    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
