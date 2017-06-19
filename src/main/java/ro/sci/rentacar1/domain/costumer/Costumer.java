package ro.sci.rentacar1.domain.costumer;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Costumer {
    private String name;
    private String surname;
    private long phone;
    private String email;
    private Address address;

    //constructor
    public Costumer(){
        this.name = name;
        this.surname = surname;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress(String town) {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
