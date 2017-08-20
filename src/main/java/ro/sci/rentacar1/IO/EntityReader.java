package ro.sci.rentacar1.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 8/6/2017.
 */
public class EntityReader {

        public List<String> readLines(File file) {
            Charset charset = Charset.forName("UTF8");


            List<String> listInput = new ArrayList<>();
            try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    listInput.add(line);
                }
            } catch (IOException e) {
                System.err.println("IOException:" + e);
            }
            return listInput;
        }
}
