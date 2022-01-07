package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    private final List<Car> cars = new ArrayList<>();

    /**
     * Захардкодили в конструктор кары, так как не юзаем БД
     */
    public CarRepository() {
        cars.add(new Car("Toyota", "Black", 2020));
        cars.add(new Car("Lada", "White", 1987));
        cars.add(new Car("Opel", "White", 2015));
        cars.add(new Car("BMW", "Red", 2006));
        cars.add(new Car("Mazda", "Blue", 2012));
        cars.add(new Car("Mazda", "Red", 2021));
    }

    public List<Car> getCars() {
        return cars;
    }
}
