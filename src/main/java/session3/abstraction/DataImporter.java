package session3.abstraction;

import java.util.List;

public class DataImporter {

    private final CarReader reader;

    public DataImporter(CarReader reader) {
        this.reader = reader;
    }

    public void doImport() {
        List<Car> cars = reader.readCars();
        int totalPrice = 0;
        // import to DB
        for (Car car : cars) {
            System.out.println("Importing car: " + car);
            totalPrice += car.getPrice();
        }
        System.out.println("Total price of imported cars: "  + totalPrice);
    }

}
