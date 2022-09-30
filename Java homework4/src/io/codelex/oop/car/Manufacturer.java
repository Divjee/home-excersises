package io.codelex.oop.car;

import java.time.LocalDate;

public class Manufacturer {
    String name;
    int yearOfEstablishment;
    String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer that)) return false;

        if (getYearOfEstablishment() != that.getYearOfEstablishment()) return false;
        if (!getName().equals(that.getName())) return false;
        return getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getYearOfEstablishment();
        result = 31 * result + getCountry().hashCode();
        return result;
    }
}
