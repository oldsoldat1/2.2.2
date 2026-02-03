package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        System.out.println("=== CarServiceImpl constructor ===");

        cars = List.of(
                new Car("Moskvitch", "red", 1966),
                new Car("Lada", "baklajan", 1985),
                new Car("Volga", "black", 1953),
                new Car("Chaika", "brown", 1945),
                new Car("Buhanka", "grey", 1958)
        );

        System.out.println("Created " + cars.size() + " cars");
        cars.forEach(car -> System.out.println("  - " + car));
    }

    @Override
    public List<Car> getCars(int count) {
        System.out.println("=== getCars called with count: " + count + " ===");

        if (count >= cars.size()) {
            System.out.println("Returning all " + cars.size() + " cars");
            return new ArrayList<>(cars);
        }
        if (count <= 0) {
            System.out.println("Returning empty list");
            return new ArrayList<>();
        }

        List<Car> result = new ArrayList<>(cars.subList(0, count));
        System.out.println("Returning " + result.size() + " cars");
        return result;
    }
}