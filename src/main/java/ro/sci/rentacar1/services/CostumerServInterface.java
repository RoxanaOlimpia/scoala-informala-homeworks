package ro.sci.rentacar1.services;

import ro.sci.rentacar1.domain.costumer.Costumer;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface CostumerServInterface<Costumer> {
    //Finds costumers by surname in the list
    List<Costumer> findCostumersBySurname(String surname);

    //Finds costumers by phone number in the list
    List<Costumer> findCostumersByPhone(String phone);

    //Finds costumers by email address in the list
    List<Costumer> findCostumersByEmail(String email);

    //Finds costumer by town
    List<Costumer> findCostumerByTown(String town);

    //Finds costumers by surname, name and phone number in the list
    List<Costumer> findCostumersBySurnameNameAndPhone(String surname, String name, String phone);


}
