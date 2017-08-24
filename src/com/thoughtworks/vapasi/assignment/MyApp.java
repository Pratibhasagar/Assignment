package com.thoughtworks.vapasi.assignment;

public class MyApp {

    public static void main(String[] args) {

        FruitShop shop = new FruitShop();
        shop.storeFruit(new Fruit("Apple", (double) 100));
        shop.storeFruit(new Fruit("Orange", (double) 80));
        shop.storeFruit(new Fruit("Banana", (double) 30));
        shop.storeFruit(new Fruit("Kiwi", (double) 120));

        Customer customer = new Customer();
        customer.addItemToBasket(new Item("Apple", (double) 2));
        customer.addItemToBasket(new Item("Orange", (double) 1.5));
        customer.addItemToBasket(new Item("Banana", (double) 0.5));
        customer.addItemToBasket(new Item("Kiwi", (double) 0.75));

        shop.printReceipt(customer.getBasket());
    }
}
