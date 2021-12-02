package web;

public class Car {
    private String model;
    private String color;
    private int mileage;

    public Car() {
    }

    public Car(String model, String color, int mileage) {
        this.model = model;
        this.color = color;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
