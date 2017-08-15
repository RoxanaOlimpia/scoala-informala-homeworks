package ro.sci.rentacar1.IO;

import java.io.File;
import java.util.List;

/**
 * Created by Roxana on 8/7/2017.
 */
public interface EntityWriter<T> {

    void writeObj(List<T> t, File file);

}
