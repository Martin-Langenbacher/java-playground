package session3.abstraction;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CarReaderJson implements CarReader{

    @Override
    public List<Car> readCars() {

        ObjectMapper mapper = new ObjectMapper();
        List<Car> carList = new ArrayList<>();

        InputStream is = CarReaderJson.class.getResourceAsStream("car.json");

        try {
            Car car = mapper.readValue(is, Car.class);
            carList.add(car);

        } catch (IOException exception) {
            throw new RuntimeException(exception);
            //exception.printStackTrace();
        }

        return carList;
    }

}


/*
ObjectMapper mapper = new ObjectMapper();

	//JSON file to Java object
	Staff obj = mapper.readValue(new File("c:\\test\\staff.json"), Staff.class);

	//JSON URL to Java object
	Staff obj = mapper.readValue(new URL("http://some-domains/api/staff.json"), Staff.class);

	//JSON string to Java Object
	Staff obj = mapper.readValue("{'name' : 'mkyong'}", Staff.class);
 */