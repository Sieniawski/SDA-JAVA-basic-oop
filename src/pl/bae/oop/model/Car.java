package pl.bae.oop.model;

public class Car {

    private String model;
    private String engine;
    private double price;
    private int speed;

    //KONSTRUKTOR
    public Car(String model, String engine, double price, int speed) {
        this.model = model;
        this.engine = engine;
        this.price = price;
        this.speed = speed;
    }
    //GETERY
    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }
    //SETERY
    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }




}
