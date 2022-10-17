package io.codelex.oop.car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Car {
    String name;
    String model;
    BigDecimal price;
    int yearOfManufacture;
    EngineType engine;

    List<Manufacturer> manufacturers;


    public Car() {
    }

    public Car(String name, String model, BigDecimal price, int yearOfManufacture, EngineType engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.manufacturers = new ArrayList<>();


    }


    public void addManif(Manufacturer add) {
        manufacturers.add(add);
    }


    public String getName() {
        return name;
    }


    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public EngineType getEngine() {
        return engine;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engine=" + engine +
                ", manufacturers=" + manufacturers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getYearOfManufacture() != car.getYearOfManufacture()) return false;
        if (!getName().equals(car.getName())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getPrice().equals(car.getPrice())) return false;
        if (getEngine() != car.getEngine()) return false;
        return getManufacturers().equals(car.getManufacturers());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getPrice().hashCode();
        result = 31 * result + getYearOfManufacture();
        result = 31 * result + getEngine().hashCode();
        result = 31 * result + getManufacturers().hashCode();
        return result;
    }
}