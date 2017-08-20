package ro.sci.rentacar1.services;

import ro.sci.rentacar1.domain.customer.Customer;
import ro.sci.rentacar1.repository.CustomerRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public class CustomerServ implements CustomerServInterface<Customer> {

    private CustomerRepo<Customer> customerRepoList;

    public CustomerServ(CustomerRepo customerRepoList){this.customerRepoList = this.customerRepoList;}

    public List<Customer> findCustomersBySurname(String surname) {
        List<Customer>foundCustomersBySurname = new ArrayList<Customer>();
        for (Customer customers: customerRepoList.getCustomerRepoList()){
            if(customers.getSurname().equals(surname)){
                foundCustomersBySurname.add(customers);
            }
        }
        return foundCustomersBySurname;
    }

    public List<Customer> findCustomersByPhone(String phone) {
        List<Customer> foundCustomersByPhone = new ArrayList<Customer>();
        for (Customer customers : customerRepoList.getCustomerRepoList()) {
            if(customers.getPhone()== phone){
                foundCustomersByPhone.add(customers);
            }
        }
        return foundCustomersByPhone;
    }

    public List<Customer> findCustomersByEmail(String email) {
        List<Customer>foundCustomersByEmail = new ArrayList<Customer>();
        for (Customer customers: customerRepoList.getCustomerRepoList()){
            if(customers.getEmail().equals(email));{
                foundCustomersByEmail.add(customers);
            }
        }
        return foundCustomersByEmail;
    }

    public List<Customer> findCustomerByTown(String town) {
        List<Customer>foundCustomersByTown = new ArrayList<Customer>();
        for (Customer customers: customerRepoList.getCustomerRepoList()){
            if (customers.getAddress(town).equals(town));{
                foundCustomersByTown.add(customers);
            }
        }
        return foundCustomersByTown;
    }

    public List<Customer> findCustomersBySurnameNameAndPhone(String surname, String name, String phone) {
        List<Customer>foundCustomersBySurnameNameAndPhone = new ArrayList<Customer>();
        for(Customer customers: customerRepoList.getCustomerRepoList()){
            if(customers.getSurname().equals(surname)&& customers.getName().equals(name)&& customers.getPhone()== phone);{
                foundCustomersBySurnameNameAndPhone.add(customers);
            }
        }
        return foundCustomersBySurnameNameAndPhone;
    }
}
