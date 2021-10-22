package session3.abstraction;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
//import static java.util.Arrays.asList;

public class CarReaderJson implements CarReader{

    @Override
    public List<Car> readCars() {

        ObjectMapper mapper = new ObjectMapper();

        InputStream is = CarReaderJson.class.getResourceAsStream("cars.json");

        try {
            // return varianteEins(mapper, is);
            // return varianteZwei(mapper, is);
            // return varianteZweiA(mapper, is);
            return varianteDrei(mapper, is);

        } catch (IOException exception) {
            throw new RuntimeException(exception);
            //exception.printStackTrace();
        }

    }

    // Variante 1:
    private List<Car> varianteEins(ObjectMapper mapper, InputStream is) throws IOException {
        List<Car> carList = new ArrayList<>();
        // Nur ein Element wird gelesen:
        //Car cars = mapper.readValue(is, Car.class);
        // Jackson-Methode hilft mit der readValue Methode alles einzulesen - in dem Fall ein Array
        Car[] cars = mapper.readValue(is, Car[].class);
        for (int i=0; i < cars.length; i++ ) {
            carList.add(cars[i]);
        }
        return carList;
    }

    // Variante 2:
    private List<Car> varianteZwei(ObjectMapper mapper, InputStream is) throws IOException {
        // Array in Colection-Typ umwandeln:
        return new ArrayList<>(asList(mapper.readValue(is, Car[].class)));
    }

    // Erklärung: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

    // Wir können beim instanziieren der ArrayList direkt eine gesamte Liste übergeben!
    /*
    ArrayList(Collection<? extends E> c)
    Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
    */



    // Variante 2a:
    private List<Car> varianteZweiA(ObjectMapper mapper, InputStream is) throws IOException {
        // Array in Colection-Typ umwandeln:
        return asList(mapper.readValue(is, Car[].class));
    }


    // Variante 3: --> Wir lesen direkt die Liste
    private List<Car> varianteDrei(ObjectMapper mapper, InputStream is) throws IOException {
        // Jackson hat typ-referenz eingefügt, damit dies geht: List.class

        // new TypeReference<List<Car>>(){} ist eine anonyme Klasse
        System.out.println(new TypeReference<List<Car>>(){}.getType().getClass());
        return mapper.readValue(is, new TypeReference<List<Car>>(){});
    }

    // Link: https://stackoverflow.com/questions/6349421/how-to-use-jackson-to-deserialise-an-array-of-objects

}

// Varianten:
/*

1. Schliefe in try: Ich füge der Carliste die einzelnen Array-Items hinzu
2. Wir fügen der Car-Liste mit hilfe von AddAll das convertierte CarArray hinzu
3.

 */





/*
ObjectMapper mapper = new ObjectMapper();

	//JSON file to Java object
	Staff obj = mapper.readValue(new File("c:\\test\\staff.json"), Staff.class);

	//JSON URL to Java object
	Staff obj = mapper.readValue(new URL("http://some-domains/api/staff.json"), Staff.class);

	//JSON string to Java Object
	Staff obj = mapper.readValue("{'name' : 'mkyong'}", Staff.class);
 */