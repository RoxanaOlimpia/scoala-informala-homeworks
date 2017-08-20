package ro.sci.rentacar1.IO.customerIO;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import ro.sci.rentacar1.IO.Convertor;
import ro.sci.rentacar1.IO.InvalidEntityException;
import ro.sci.rentacar1.domain.customer.Address;
import ro.sci.rentacar1.domain.customer.Customer;



/**
 * Created by Roxana on 8/7/2017.
 */
public class CustomerConvertor implements Convertor<Customer> {

    private static final Logger LOGGER = Logger.getLogger("CustomerConvertor");

    @Override
    public Customer convert(String convertedString) throws InvalidEntityException {

        String[] tokens = convertedString.split(",");
        if (tokens.length != 8) {
            throw new InvalidEntityException("Invalid Customer Description");
        }

        Customer customer = new Customer();
        customer.setName(tokens[0].trim());
        customer.setSurname(tokens[1].trim());
        customer.setPhone(tokens[2].trim());
        customer.setEmail(tokens[3].trim());
        customer.setAddress(new Address(tokens[4], tokens[5],tokens[6],tokens[7]));

        LOGGER.log(Level.INFO,"Customer in this list: " + customer);
        return customer;
    }
}
