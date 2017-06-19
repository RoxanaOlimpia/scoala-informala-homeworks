package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.costumer.Costumer;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface CostumerRepoInterface {
    //Adds a new costumer to the list
    public void addCostumer(Costumer costumer);

    //Finds costumers by different indicators in the list
    List<Costumer> findCostumer();

    //Updates the state of a costumer in the list
    public void updateCostumer(Costumer costumer);

    //Deletes a costumer from the list
    public void deleteCostumer(Costumer costumer);

}
