package ro.sci.rentacar1.domain.car;

/**
 * Created by Roxana on 7/5/2017.
 */
public enum PriceCategory {
    ECONOMY, ECONOMYPLUS, HIGHCLASS;

//METHOD that converts to String the objects of type PriceCategory

    @Override
    public String toString() {
        return "PriceCategory{}";
    }
}
