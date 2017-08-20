package ro.sci.rentacar1.IO.customerIO;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import ro.sci.rentacar1.IO.EntityWriter;
import ro.sci.rentacar1.domain.customer.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Roxana on 8/7/2017.
 */
public class CustomerWriter<Customer> implements EntityWriter<Customer> {

    private static final Logger LOGGER = Logger.getLogger("CustomerWriter");

    @Override
    public void writeObj(List<Customer> customerRepo, File file) {
        Charset charset = Charset.forName("UTF8");

        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(), charset)) {

            ListIterator iterator = customerRepo.listIterator();

            while (iterator.hasNext()) {
                writer.write(iterator.next().toString());

                if (!iterator.hasNext()) {
                    break;
                }
                writer.write("\n");
            }

            LOGGER.log(Level.INFO, "Customer list writing was successful.");

        } catch (IOException e) {
            LOGGER.log(Level.WARN, "IO exception" + e);

        }


    }

}
