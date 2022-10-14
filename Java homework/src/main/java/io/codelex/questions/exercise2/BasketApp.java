package io.codelex.questions.exercise2;

public class BasketApp {
    public static void main(String[] args) {
        Apple apple =  new Apple();
        Mushroom mushroom = new Mushroom();


        Basket<Apple>appleBasket = new Basket();
     //   appleBasket.addItems(mushroom); Cant add mushroom

        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        appleBasket.addItems(apple);
        //throws error if more than 10 items added
        System.out.println(appleBasket.getItems());

        Basket<Mushroom>mushroomBasket = new Basket();
        mushroomBasket.addItems(mushroom);
        mushroomBasket.addItems(mushroom);
        mushroomBasket.addItems(mushroom);
       mushroomBasket.removeItems(mushroom);

    }
}
