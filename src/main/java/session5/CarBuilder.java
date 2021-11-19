package session5;

import java.security.cert.CertPathBuilder;

public class CarBuilder {

    String brand;
    String color;
    int price;
    String model;


    public CarBuilder brand(String brandName) {
        this.brand = brandName;
        return this;
    }

    public CarBuilder color(String colorName) {
        this.color = colorName;
        return this;
    }

    public CarBuilder price(int priceAmount) {
        this.price = priceAmount;
        return this;
    }

    public CarBuilder model(String modelName) {
        this.model = modelName;
        return this;
    }

    public Car build() {
        // Achtung: Hier muss die Reihenfolge stimmen --> Siehe Car-Konstruktor
        Car car = new Car (brand, model, price, color);
        return car;
    }
}
