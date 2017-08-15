package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.customer.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CustomerRepo<Customer> implements RepoInterface<Customer> {

    public List<Customer> customerRepoList = new ArrayList<Customer>();

    //constructor
    public CustomerRepo(List<Customer> customerRepoList) {
        this.customerRepoList = customerRepoList;
    }

    public CustomerRepo() {

    }

    //getter
    public List<Customer> getCustomerRepoList() {
        return customerRepoList;
    }

    //methods
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

    public List<Customer> getCostumerRepoList() {
        return customerRepoList;
    }
}
