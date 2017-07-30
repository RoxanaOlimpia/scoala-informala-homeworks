package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.costumer.Costumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CostumerRepo<Costumer> implements RepoInterface<Costumer> {

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
    public void add(Costumer costumer) {
        costumerRepoList.add(costumer);

    }

    public List<Costumer> find() {
        return costumerRepoList;

    }

    public void update(Costumer costumer) {
        getCarRepoList().set(costumerRepoList.indexOf(costumerRepoList), costumer);
    }

    public void delete(Costumer costumer) {
        costumerRepoList.remove(costumer);

    }

    public List<Costumer> getCostumerRepoList() {
        return costumerRepoList;
    }
}
