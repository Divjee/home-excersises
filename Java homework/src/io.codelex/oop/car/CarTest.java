package io.codelex.oop.car;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1928, "Germnay");
        Manufacturer audi = new Manufacturer("AUDI", 1909, "Germnay");
        Manufacturer McLaren = new Manufacturer("McLaren", 1963, "England");
        Manufacturer bugatti = new Manufacturer("BUGATTI", 1909, "Germany");
        Manufacturer Volvo = new Manufacturer("VOLVO", 1927, "Sweden");


        Car bmwE46 = new Car("BMWe46", "330D Touring", new BigDecimal(36500), 2004, EngineType.V6);
        Car veyRon = new Car("BUGATTI VEYRON", "EB 16.4", new BigDecimal(220000), 2018, EngineType.V12);
        Car volvo = new Car("Volvo", "S80 3.2 AWD", new BigDecimal(5500), 2006, EngineType.S3);
        Car MclAREN = new Car("McLaren", "720S", new BigDecimal(3650), 2004, EngineType.S6);
        Car zigulis = new Car("Zigulis", "10000power", new BigDecimal(600000000), 1980, EngineType.V12);
        Car audiRs = new Car("AUDIRS", "RS5 SPORTSBACK", new BigDecimal(365), 1990, EngineType.V12);
        Car zurka = new Car("ZURKABMW", "WINTER BEATER", new BigDecimal(500), 1990, EngineType.V12);

        zurka.addManif(bmw);
        bmwE46.addManif(bmw);
        veyRon.addManif(bugatti);
        volvo.addManif(Volvo);
        MclAREN.addManif(McLaren);
        zigulis.addManif(bugatti);
        audiRs.addManif(audi);
        System.out.println("==================TEST=======================");
        System.out.println(bmwE46.manufacturers.get(0));
        System.out.println("\n==================RETURN LIST================");

        CarService service = new CarService();
        service.addCar(bmwE46);
        service.addCar(zurka);
        service.addCar(veyRon);
        service.addCar(volvo);
        service.addCar(MclAREN);
        service.addCar(zigulis);
        service.addCar(audiRs);
        for (Car i : service.getCars()) {
            System.out.println(i);
        }

        System.out.println("\n====================V12======================");
        for (Car i : service.getV12()) {
            System.out.println(i);
        }
        System.out.println("\n====================BEFORE 1999======================");
        for (Car i : service.before1999()) {
            System.out.println(i);
        }
        System.out.println("\n====================MOST EXPENSIVE=====================");
        System.out.println(service.mostExpensive());

        System.out.println("\n=================MOST CHEAPEST ===================== ");
        System.out.println(service.mostCheapest());

        System.out.println("\n========IF CAR IS IN THE LIST=========================");
        System.out.println(service.carInList(zurka));

        System.out.println("\n============RETURN ALL BMWS(specific brand)============================");
        for (Car i : service.specificManufacturer(bmw)) {
            System.out.println(i);
        }

        System.out.println("\n=======================YEAR ESTABLISHED===================================");
        for (Car i : service.yearOfEstablishment(1909)) {
            System.out.println(i);
        }
    }
}
