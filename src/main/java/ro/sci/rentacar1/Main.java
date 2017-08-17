package ro.sci.rentacar1;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import ro.sci.rentacar1.IO.Convertor;
import ro.sci.rentacar1.IO.EntityReader;
import ro.sci.rentacar1.IO.InvalidEntityException;
import ro.sci.rentacar1.IO.carIO.CarConvertor;
import ro.sci.rentacar1.IO.carIO.CarWriter;
import ro.sci.rentacar1.IO.customerIO.CustomerConvertor;
import ro.sci.rentacar1.IO.customerIO.CustomerWriter;
import ro.sci.rentacar1.domain.Transaction;
import ro.sci.rentacar1.domain.car.Car;
import ro.sci.rentacar1.domain.car.CarState;
import ro.sci.rentacar1.domain.customer.Address;
import ro.sci.rentacar1.domain.customer.Customer;

import ro.sci.rentacar1.repository.CarRepo;
import ro.sci.rentacar1.repository.CustomerRepo;
import ro.sci.rentacar1.repository.TransactionRepo;
import ro.sci.rentacar1.services.CarServ;
import ro.sci.rentacar1.domain.Calendar;

import java.io.File;
import java.util.List;

import static ro.sci.rentacar1.domain.car.CarState.AVAILABLE;
import static ro.sci.rentacar1.domain.car.CarState.BOOKED;
import static ro.sci.rentacar1.domain.car.FuelType.HYBRID;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMY;
import static ro.sci.rentacar1.domain.car.PriceCategory.ECONOMYPLUS;
import static ro.sci.rentacar1.domain.car.PriceCategory.HIGHCLASS;

/**
 * Created by Roxana on 6/17/2017.
 */
public class Main {

    public static Logger logger =Logger.getLogger(Main.class.getName());

    public static void main (String[] args) throws InvalidEntityException {
        System.out.println("Opening Rent a Car application");


        //Creating objects of type Car with parameters
        Car volvo = new Car();
        Car bmw = new Car();
        Car volkswagen = new Car();
        Car bmw2 = new Car("BMW", "300", HYBRID, "red", 4, true, HIGHCLASS);

        Car renault = new Car();
        renault.setMake("renault");

//Creating objects of type customer
        Customer popescu = new Customer("Mihai","Popescu");

        Customer cristea = new Customer("Alexandra", "Cristea", "0765845268",
                                        "alexandracrs@yahoo.com",new Address("Zalau",
                                        "Salaj","Avram Iancu","22"));

        Customer suciu = new Customer("George", "Suciu");

//Creating a Repository for objects of type Car
        CarRepo<Car> carRepo = new CarRepo<Car>();

//Creating a repository for the objects of type Customer
        CustomerRepo<Customer> customerRepo = new CustomerRepo<Customer>();

//Adding the created objects of type Car to the carRepo
        carRepo.add(volvo);
        carRepo.add(bmw);
        carRepo.add(volkswagen);
        carRepo.add(bmw2);

//Adding customers to the customerRepo
        customerRepo.add(popescu);
        customerRepo.add(cristea);
        customerRepo.add(suciu);

        popescu.setPhone("0748754125");
        popescu.setAddress(new Address("Cluj", "Cluj-Napoca", "21 Decembrie", "41"));


        System.out.println("___________________________________________________________");
        System.out.println("The customers from the list are: ");
        for (Customer customer : customerRepo.getCustomerRepoList()) {
            System.out.println(customer.getName() + " " + customer.getSurname());
        }

        System.out.println("___________________________________________________________");


        //Setting parameters for the instantiated cars
        volvo.setMake("Volvo");
        volvo.setModel("v3");
        volvo.setColor("red");
        volvo.setFuelConsumption(4.05);

        bmw.setMake("BMW");
        bmw.setColor("black");
        bmw.setModel("m5");

        volkswagen.setMake("Volkswagen");
        volkswagen.setColor("green");
        volkswagen.setModel("Passat");

        bmw2.setColor("purple");

        volkswagen.setPriceCategory(ECONOMYPLUS);
        volvo.setPriceCategory(ECONOMY);
        bmw.setPriceCategory(HIGHCLASS);

        //Displaying a list of all cars from the carRepo
        System.out.println("The cars from the list are: ");
        for (Car car : carRepo.getCarRepoList()) {
            System.out.println(car.getMake() + " " + car.getModel());
        }

        System.out.println("___________________________________________________________");

        //Displaying all red cars from the list
        CarServ searchByColor = new CarServ(carRepo);
        List<Car> findCarsByColor = searchByColor.findCarsByColor("red");
        System.out.println("The red cars are: ");
        for (Car car : findCarsByColor) {
            System.out.println(car.getMake() + " " + car.getModel());
        }

        carRepo.delete(bmw2);

        System.out.println("___________________________________________________________");
        System.out.println("The cars from the list are: ");
        for (Car car : carRepo.getCarRepoList()) {
            System.out.println(car.getMake() + " " + car.getModel());
        }

        System.out.println("___________________________________________________________");

        //Calculating price for cars

        Calendar calendar1 = new Calendar(new DateTime(2017, 03, 12, 00, 00),
                new DateTime(2017, 03, 15, 00, 00));


        Calendar calendar2 = new Calendar(new DateTime(2017, 04, 12, 00, 00),
                new DateTime(2017, 04, 15, 00, 00));

        calendar1.getNoOfDays();






//Adding objects of type Car to carRepo from a text document

        File InCar = new File("InCar.txt");
        EntityReader entityReader = new EntityReader();
        List<String> carLines = entityReader.readLines(InCar);
        Convertor<Car> carConvertor = new CarConvertor();

        for (String line : carLines) {
            carRepo.add(carConvertor.convert(line));

        }

//Printing carRepoList
        System.out.println("The cars from the list are: ");
        for (Car car : carRepo.getCarRepoList()) {
            System.out.println(car.getMake() + " " + car.getModel());
        }

//Printing the carRepoList to a text document
        File outCar = new File("OutCar.txt");
        CarWriter carWriter = new CarWriter();
        carWriter.writeObj(carRepo.getCarRepoList(), outCar);





        File InCustomer = new File("InCustomer.txt");
        EntityReader entityReaderC = new EntityReader();
        List<String> customerLines = entityReaderC.readLines(InCustomer);
        Convertor<Customer> customerConvertor = new CustomerConvertor();

        for (String line : customerLines) {
            customerRepo.add(customerConvertor.convert(line));

        }

        System.out.println("The customers from the list are: ");
        for (Customer customer : customerRepo.getCustomerRepoList()) {
            System.out.println(customer.getName() + " " + customer.getSurname());
        }


        File outCustomer = new File("OutCustomer.txt");
        CustomerWriter customerWriter = new CustomerWriter();
        customerWriter.writeObj(customerRepo.getCustomerRepoList(),outCustomer);


        System.out.println("___________________________________________________________");

        volvo.setCarState(AVAILABLE);

            Transaction transaction2 = new Transaction(112, volvo, popescu,calendar1,600);
        //Creating a transaction
//        Transaction transaction1 = new Transaction(111,volvo,popescu,calendar2, 600);
//
//        System.out.println("Rental period: "+ transaction1.getRentalDays()+ " days");
//
//
//
//
//        TransactionRepo<Transaction> transactionRepo = new TransactionRepo<Transaction>();
//
//
//        transactionRepo.add(transaction1);
//
//        System.out.println("The transactions from the list are: ");
//        for (Transaction transaction : transactionRepo.getTransactionRepoList()) {
//            System.out.println(transaction.getId() + " client: " + transaction.getCustomer()+ " car: "+
//                    transaction.getCar()+" rental days: "+ transaction.getCalendar());
//        }
    }
}
