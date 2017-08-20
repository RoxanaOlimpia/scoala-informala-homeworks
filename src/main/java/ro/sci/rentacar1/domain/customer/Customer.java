package ro.sci.rentacar1.domain.customer;


/**
 * Created by Roxana on 6/17/2017.
 */
public class Customer {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private Address address;

//CONSTRUCTOR without parameters

    public Customer() {
    }

//CONSTRUCTORS with parameters

    public Customer(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Customer(String name, String surname, String phone, String email, Address address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

//GETTERS and SETTERS

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

    public void setAddress(Address address) {this.address = address;}



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
