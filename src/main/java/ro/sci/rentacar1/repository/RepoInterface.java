package ro.sci.rentacar1.repository;


import ro.sci.rentacar1.domain.car.Car;

import java.util.List;

/**
 * Created by Roxana on 6/17/2017.
 */
public interface RepoInterface <T> {

//CRUD methods (create, read, update, delete)
//Definition of a METHOD that ADDS a new element to the list
     void add(T t);

//Definition of a METHOD that FINDS elements by different indicators in the list
     List<T> find();

//Definition of a METHOD that UPDATES the state of an element in the list
    void update(T t);

//Definition of a METHOD that DELETES an element from the list
    void delete(T t);
}
