package ro.sci.rentacar1.services;

import ro.sci.rentacar1.domain.costumer.Costumer;
import ro.sci.rentacar1.repository.CostumerRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CostumerServ implements CostumerServInterface<Costumer> {

    private CostumerRepo<Costumer> costumerRepoList;
    public CostumerServ(CostumerRepo CostumerRepoList){this.costumerRepoList = costumerRepoList;}

    public List<Costumer> findCostumersBySurname(String surname) {
        List<Costumer>foundCostumersBySurname = new ArrayList<Costumer>();
        for (Costumer costumers: costumerRepoList.getCostumerRepoList()){
            if(costumers.getSurname().equals(surname)){
                foundCostumersBySurname.add(costumers);
            }
        }
        return foundCostumersBySurname;
    }

    public List<Costumer> findCostumersByPhone(String phone) {
        List<Costumer> foundCostumersByPhone = new ArrayList<Costumer>();
        for (Costumer costumers : costumerRepoList.getCostumerRepoList()) {
            if(costumers.getPhone()== phone){
                foundCostumersByPhone.add(costumers);
            }
        }
        return foundCostumersByPhone;
    }

    public List<Costumer> findCostumersByEmail(String email) {
        List<Costumer>foundCostumersByEmail = new ArrayList<Costumer>();
        for (Costumer costumers: costumerRepoList.getCostumerRepoList()){
            if(costumers.getEmail().equals(email));{
                foundCostumersByEmail.add(costumers);
            }
        }
        return foundCostumersByEmail;
    }

    public List<Costumer> findCostumerByTown(String town) {
        List<Costumer>foundCostumersByTown = new ArrayList<Costumer>();
        for (Costumer costumers: costumerRepoList.getCostumerRepoList()){
            if (costumers.getAddress(town).equals(town));{
                foundCostumersByTown.add(costumers);
            }
        }
        return foundCostumersByTown;
    }

    public List<Costumer> findCostumersBySurnameNameAndPhone(String surname, String name, String phone) {
        List<Costumer>foundCostumersBySurnameNameAndPhone = new ArrayList<Costumer>();
        for(Costumer costumers: costumerRepoList.getCostumerRepoList()){
            if(costumers.getSurname().equals(surname)&& costumers.getName().equals(name)&& costumers.getPhone()== phone);{
                foundCostumersBySurnameNameAndPhone.add(costumers);
            }
        }
        return foundCostumersBySurnameNameAndPhone;
    }
}
