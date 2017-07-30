package ro.sci.rentacar1.repository;


import ro.sci.rentacar1.domain.car.Car;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface RepoInterface <T> {
    //Adds a new element to the list
     void add(T t);

    //Finds elements by different indicators in the list
     List<T> find();

    //Updates the state of an element
    void update(T t);

    //Deletes an element
    void delete(T t);

}
