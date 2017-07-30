package ro.sci.rentacar1.domain.price;

import org.joda.time.DateTime;
import org.junit.Test;
import ro.sci.rentacar1.domain.calendar.Calendar;
import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.domain.car.PriceCategory;

import static org.junit.Assert.*;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMYPLUS;

/**
 * Created by Roxana on 7/5/2017.
 */
public class ComputePriceTest {

    @Test
    public void test1 (){
        //given
        ComputePrice computePriceTest = new ComputePrice();
        Car volvo = new Car();
        volvo.setPriceCategory(PriceCategory.ECONOMY);
        Calendar calendar1 = new Calendar(new DateTime (2017, 05, 12, 12, 30), new DateTime(2017, 05, 28, 12, 30));

        //then
        double result = computePriceTest.computePrice(volvo);

        //evaluate
        double expectedPrice = 3200d;
        assertEquals(expectedPrice, result,1);
    }

    @Test
    public void test2(){
        //given
        ComputePrice computePriceTest2 = new ComputePrice ();
        Car volkswagen = new Car();
        volkswagen.setPriceCategory(ECONOMYPLUS);

        //then
        double result2 = computePriceTest2.computePrice(volkswagen);

        //evaluate
        double expectedPrice2 = 400;
        assertEquals (expectedPrice2, result2, 1);


    }

}