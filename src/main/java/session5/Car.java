package session5;

public class Car {

    private String brand;
    private String model;
    private int price;
    private String color;

    // JSON needs a default constructor !!!
    public Car(){
    }

    public Car(String brand, String model, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // is a factory method
    public static CarBuilder newBuilder () {
        return new CarBuilder();
    }


// inner Class...
// Warum muss hier static stehen ????????  <===================
    public static class CarBuilder {

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
            Car car = new Car(brand, model, price, color);
            return car;
        }


    }


}
