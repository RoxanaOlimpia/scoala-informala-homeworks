package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.costumer.Costumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CostumerRepo implements CostumerRepoInterface {

    public List<Costumer> costumerRepoList = new ArrayList<Costumer>();

    //constructor
    public CostumerRepo(List<Costumer> carRepoList) {
        this.costumerRepoList = carRepoList;
    }

    //getter
    public List<Costumer> getCarRepoList() {
        return costumerRepoList;
    }

    //methods
    public void addCostumer(Costumer costumer) {
        costumerRepoList.add(costumer);

    }

    public List<Costumer> findCostumer() {
        return costumerRepoList;

    }

    public void updateCostumer(Costumer costumer) {
        getCarRepoList().set(costumerRepoList.indexOf(costumerRepoList), costumer);
    }

    public void deleteCostumer(Costumer costumer) {
        costumerRepoList.remove(costumer);

    }

    public List<Costumer> getCostumerRepoList() {
        return costumerRepoList;
    }
}
