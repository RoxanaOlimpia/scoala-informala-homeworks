package ro.sci.rentacar1.services;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface CustomerServInterface<Customer> {

//Finds costumers by surname in the list
    List<Customer> findCustomersBySurname(String surname);

//Finds costumers by phone number in the list
    List<Customer> findCustomersByPhone(String phone);

//Finds costumers by email address in the list
    List<Customer> findCustomersByEmail(String email);

//Finds customer by town
    List<Customer> findCustomerByTown(String town);

//Finds costumers by surname, name and phone number in the list
    List<Customer> findCustomersBySurnameNameAndPhone(String surname, String name, String phone);


}
