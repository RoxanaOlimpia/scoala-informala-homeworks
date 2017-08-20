package ro.sci.rentacar1.domain.customer;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Address {
    private String town;
    private String county;
    private String street;
    private String houseNr;

//CONSTRUCTOR without parameters

    public Address(){
    }

//CONSTRUCTORS with parameters

    public Address(String town, String county, String street, String houseNr) {
        this.town = town;
        this.county = county;
        this.street = street;
        this.houseNr = houseNr;
    }


//GETTERS and SETTERS

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

    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", houseNr='" + houseNr + '\'' +
                '}';
    }
}

