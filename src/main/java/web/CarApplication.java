package web;

import java.util.ArrayList;
import java.util.List;

public class CarApplication {
    List<Car> cars = null;

    public List<Car> getCars(Integer count) {
        if (cars == null) {
            cars = new ArrayList<>();
        }
        cars.add(new Car("Opel", "black", 200000));
        cars.add(new Car("BMW", "blue", 50000));
        cars.add(new Car("Lexus", "white", 30000));
        cars.add(new Car("Mercedes", "gray", 15000));
        cars.add(new Car("Volkswagen", "black", 100000));
        if (count == null || count >= 5) {
            return cars;
        } else {
            cars = cars.subList(0, count);
        }
        return cars;
    }
}
