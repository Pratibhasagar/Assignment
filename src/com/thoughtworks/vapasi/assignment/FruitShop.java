package com.thoughtworks.vapasi.assignment;

import java.util.ArrayList;
import java.util.List;

public class FruitShop {

    private List<Fruit> fruitsList = new ArrayList<Fruit>();

    public void storeFruit(Fruit fruit) {
        boolean isFruitAbsent = true;
        for (Fruit temp : this.fruitsList) {
            if (fruit.getName().equals(temp.getName()) == true) {
                isFruitAbsent = false;
                temp.setPrice(fruit.getPrice());
                break;
            }
        }
        if (isFruitAbsent == true) {
            this.fruitsList.add(fruit);
        }
    }

    public void printReceipt(List<Item> basket) {

        Double sumTotal = (double) 0;
        boolean matchFound = false;

        System.out.println("Fruit\tQty(kg)\tAmount");
        System.out.println("===========================");

        for (Item item : basket) {
            for (Fruit fruit : fruitsList) {
                if (item.getName().equals(fruit.getName())) {
                    System.out.println(item.getName().toUpperCase() + "\t" +
                            item.getQuantity() + " \t" +
                            (fruit.getPrice()) * item.getQuantity());
                    sumTotal += fruit.getPrice() * item.getQuantity();
                    matchFound = true;
                    break;
                }
            }
            if (matchFound == false) {
                System.out.println(item.getName().toUpperCase() + " is not available today. :(");
            } else {
                // Reset the flag
                matchFound = false;
            }
        }
        System.out.println("===========================");
        System.out.println("Total amount  \t" + sumTotal);
    }
}
