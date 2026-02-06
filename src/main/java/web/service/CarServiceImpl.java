package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {

        cars = List.of(
                new Car("Moskvitch", "red", 1966),
                new Car("Lada", "baklajan", 1985),
                new Car("Volga", "black", 1953),
                new Car("Chaika", "brown", 1945),
                new Car("Buhanka", "grey", 1958)
        );
    }

    @Override
    public List<Car> getCars(int count) {
       if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        if (count <= 0) {
            return new ArrayList<>();
        }
        List<Car> result = new ArrayList<>(cars.subList(0, count));
        return result;
    }
}