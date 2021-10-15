package session3.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarReaderCsv implements CarReader {

    @Override
    public List<Car> readCars() {
        List<Car> cars = new ArrayList<>();
        InputStream is = CarReaderCsv.class.getResourceAsStream("cars.csv");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = null;
        try {
            reader.readLine();
            // skip first line
            line = reader.readLine();
            while (line != null) {
                cars.add(readCar(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return cars;
    }

    public Car readCar(String line) {
        // VW,Golf GTI V,50000,red
        String[] fields = line.split(",");
        return new Car(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3]);
    }

}

