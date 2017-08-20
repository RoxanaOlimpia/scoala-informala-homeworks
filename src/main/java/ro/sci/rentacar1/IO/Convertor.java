package ro.sci.rentacar1.IO;

/**
 * Created by Roxana on 8/6/2017.
 */
public interface Convertor <T> {
    T convert(String convertedString) throws InvalidEntityException;
}
