package ro.sci.rentacar1.domain.car;

/**
 * Created by Roxana on 6/17/2017.
 */
public enum FuelType {
    DIESEL, PETROL, HYBRID;

//METHOD that converts to String the objects of type FuelType

    @Override
    public String toString() {
        return "FuelType{}";
    }
}
