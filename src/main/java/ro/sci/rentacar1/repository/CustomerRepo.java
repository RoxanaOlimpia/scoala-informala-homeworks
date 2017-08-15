package ro.sci.rentacar1.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CustomerRepo<Customer> implements RepoInterface<Customer> {

    public List<Customer> customerRepoList = new ArrayList<Customer>();

//CONSTRUCTOR without parameters
    public CustomerRepo() {
    }

//CONSTRUCTOR with parameters
    public CustomerRepo(List<Customer> customerRepoList) {
        this.customerRepoList = customerRepoList;
    }

//GETTER for the customer list
    public List<Customer> getCustomerRepoList() {
        return customerRepoList;
    }


//Implementation of CRUD methods

    public void add(Customer customer) {
        customerRepoList.add(customer);
    }

    public List<Customer> find() {
        return customerRepoList;
    }

    public void update(Customer customer) {
        getCustomerRepoList().set(customerRepoList.indexOf(customerRepoList), customer);
    }

    public void delete(Customer customer) {
        customerRepoList.remove(customer);

    }

}
