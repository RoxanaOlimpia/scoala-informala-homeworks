package ro.sci.rentacar1.IO.carIO;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import ro.sci.rentacar1.IO.Convertor;
import ro.sci.rentacar1.IO.InvalidEntityException;
import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.domain.car.CarState;
import ro.sci.rentacar1.domain.car.FuelType;
import ro.sci.rentacar1.domain.car.PriceCategory;

/**
 * Created by Roxana on 8/7/2017.
 */
public class CarConvertor implements Convertor<Car> {

    public static final Logger LOGGER = Logger.getLogger("CarConvertor");
    @Override
    public Car convert(String convertedString) throws InvalidEntityException {

        String[] tokens = convertedString.split(",");

        if (tokens.length != 10){
            throw new InvalidEntityException("Your car description from the given document is not valid or complete");
        }

        Car car = new Car();
        car.setMake(tokens[0]);
        car.setModel(tokens[1]);
        car.setFuelType(FuelType.valueOf(tokens[2].toUpperCase()));
        car.setColor(tokens[3]);
        car.setNumberOfSeats(Integer.valueOf(tokens[4]));
        car.setGps(Boolean.getBoolean(tokens[5]));
        car.setAutomaticGearbox(Boolean.getBoolean(tokens[6]));
        car.setFuelConsumption(Double.valueOf(tokens[7]));
        car.setPriceCategory(PriceCategory.valueOf(tokens[8]));
        car.setCarState(CarState.valueOf(tokens[9]));

        LOGGER.log(Level.INFO, "Car "+ car.getMake()+" " + car.getModel() + " was added to carRepo from the given document");
        return car;
    }

}
