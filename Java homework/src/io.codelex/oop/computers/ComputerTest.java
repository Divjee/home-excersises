package io.codelex.oop.computers;

import java.time.temporal.ChronoUnit;

public class ComputerTest {
    public static void main(String[] args) {
        Computer custom = new Computer("Intel(r)", 16, "Radeon(TM) RX 80", "MIXED", "1");
        Computer custom2 = new Computer("Intel(r)", 16, "Radeon(TM) RX 80", "MIXED", "1");

        Laptop hp = new Laptop("Intel(abc", 8, "Video", "Hewlett-Packard (HP)", "2", 37.5);


        System.out.println(hp.toString());
        hp.chargeBattery();
        System.out.println(hp.getBatteryLife());
        hp.setBatteryLife(57);
        System.out.println(hp.getBatteryLife());


        System.out.println(custom.getProcessor().equals(custom2.getProcessor()));
        System.out.println(custom.hashCode() == custom2.hashCode());
        System.out.println(custom.toString());


    }
}
