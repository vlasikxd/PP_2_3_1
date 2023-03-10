package web.models;

public class Car {
    private String brand;
    private String model;
    private int speedLimit;

    public Car(String brand, String model, int speedLimit) {
        this.brand = brand;
        this.model = model;
        this.speedLimit = speedLimit;
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

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
