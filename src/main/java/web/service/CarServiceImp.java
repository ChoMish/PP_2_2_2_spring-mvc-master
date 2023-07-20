package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private ArrayList<Car> massiveCars = new ArrayList<>();
    {
        massiveCars.add(new Car("Toyota","Carina","111"));
        massiveCars.add(new Car("Honda","Accord","222"));
        massiveCars.add(new Car("Honda","Torneo","333"));
        massiveCars.add(new Car("VAZ","Priora","444"));
        massiveCars.add(new Car("VAZ","Zaporojec","555"));
    }
    @Override
    public List<Car> getCars(int count) {
        ArrayList<Car> resultCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            resultCars.add(massiveCars.get(i));
        }
        return resultCars;
    }
}
