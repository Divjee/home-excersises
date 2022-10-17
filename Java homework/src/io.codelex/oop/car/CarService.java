package io.codelex.oop.car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getV12() {
        List<Car> carsWithV12 = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngine() == EngineType.V12) {
                carsWithV12.add(cars.get(i));
            }
        }
        return carsWithV12;
    }

    public List<Car> before1999() {
        List<Car> before1999 = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).yearOfManufacture < 1999) {
                before1999.add(cars.get(i));
            }
        }
        return before1999;
    }

    public Car mostExpensive() {
        Car mostExpensive = new Car();
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if (cars.get(i).price.compareTo(cars.get(j).price) == 1) {
                    mostExpensive = cars.get(i);
                }
            }
        }
        return mostExpensive;
    }

    public Car mostCheapest() {
        Car cheapest = new Car();
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if (cars.get(i).price.compareTo(cars.get(j).price) == -1) {
                    cheapest = cars.get(i);
                }
            }
        }
        return cheapest;
    }

    public boolean carInList(Car car) {
        if (cars.contains(car)) {
            return true;
        } else {
            return false;
        }
    }

    public List<Car> specificManufacturer(Manufacturer brand) {
        List<Car> specificBrand = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).manufacturers.get(0).equals(brand)) {
                specificBrand.add(cars.get(i));
            }
        }
        return specificBrand;
    }

    public List<Car> yearOfEstablishment(int year) {
        List<Car> establish = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).manufacturers.get(0).yearOfEstablishment == year) {
                establish.add(cars.get(i));
            }
        }
        return establish;
    }

}
