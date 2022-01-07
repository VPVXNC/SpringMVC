package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(int count) {
        List<Car> repositoryCarsList = carRepository.getCars();
        List<Car> list = new ArrayList<>();
        if (count >= 5) {
            list.addAll(repositoryCarsList);
            return list;
        }
        for (int i = 0; i <= count - 1; i++) {
            list.add(repositoryCarsList.get(i));
        }
        return list;
    }
}
