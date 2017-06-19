package ro.sci.rentacar1.domain.costumer;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Address {
    private String town;
    private String county;
    private String street;
    private String houseNr;

    //constructors
    public Address(){
    }

    public Address(String town) {
        this.town = town;
    }

    //setters and getters
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }
}

