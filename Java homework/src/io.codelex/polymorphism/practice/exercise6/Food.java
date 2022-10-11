package io.codelex.polymorphism.practice.exercise6;

public  abstract class Food {
    Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    protected Food() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;

        return quantity.equals(food.quantity);
    }

    @Override
    public int hashCode() {
        return quantity.hashCode();
    }
}
