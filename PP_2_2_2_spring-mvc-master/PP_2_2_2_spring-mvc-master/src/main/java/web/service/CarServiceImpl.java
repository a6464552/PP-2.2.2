package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Audi", "A", 10000));
        carList.add(new Car("BMW", "B", 12000));
        carList.add(new Car("Citroen", "C", 7000));
        carList.add(new Car("Audi", "D", 8000));
        carList.add(new Car("Audi", "E", 9000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
