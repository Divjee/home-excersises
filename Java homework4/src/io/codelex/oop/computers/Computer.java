package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    private String processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, int ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;

        if (ram != computer.ram) return false;
        if (!Objects.equals(processor, computer.processor)) return false;
        if (!Objects.equals(graphicsCard, computer.graphicsCard))
            return false;
        if (!Objects.equals(company, computer.company)) return false;
        return Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        int result = processor != null ? processor.hashCode() : 0;
        result = 31 * result + ram;
        result = 31 * result + (graphicsCard != null ? graphicsCard.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }


}

