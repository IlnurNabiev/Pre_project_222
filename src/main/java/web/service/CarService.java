package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    List<Car> show(List<Car> cars, int count);
}
