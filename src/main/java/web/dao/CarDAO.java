package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ferrari","LaFerrari", 355));
        cars.add(new Car("Lamborghini","Aventador", 350));
        cars.add(new Car("Bugatti","Veyron", 407));
        cars.add(new Car("McLaren","Senna", 340));
        cars.add(new Car("Koenigsegg","LaFerrari", 450));
    }

    public List<Car> getCars(int count) {
        if (count>cars.size()) {
            count=cars.size();
        }
        return cars.subList(0, count);
    }
}
