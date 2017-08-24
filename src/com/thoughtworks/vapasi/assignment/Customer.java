package com.thoughtworks.vapasi.assignment;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Item> basket = new ArrayList<Item>();

    public List<Item> getBasket() {
        return this.basket;
    }

    public void addItemToBasket(Item item) {
        this.basket.add(item);
    }

    public void removeItemFromBasket(Item item) {
        this.basket.remove(item);
    }
}
