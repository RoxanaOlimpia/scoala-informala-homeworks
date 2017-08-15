package ro.sci.rentacar1.IO.carIO;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import ro.sci.rentacar1.IO.EntityWriter;


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
public class CarWriter<Car> implements EntityWriter<Car> {

    public static final Logger LOGGER = Logger.getLogger("CarWriter");
    @Override
    public void writeObj(List<Car> carRepoList, File file) {

        Charset charset = Charset.forName("UTF8");

        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(), charset)) {

            ListIterator iterator = carRepoList.listIterator();

            while (iterator.hasNext()) {
                writer.write(iterator.next().toString());

                if (!iterator.hasNext()) {
                    break;
                }
                writer.write("\n");
            }

            LOGGER.log(Level.INFO, "The carRepoList was succesfully written on " + file);

        } catch (IOException e) {
            LOGGER.log(Level.WARN, "IO exception" + e);

        }
    }


}
