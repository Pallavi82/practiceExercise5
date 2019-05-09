package com.stackroute.pefive;

/*1. Write a Java program to update specific array element by given element and empty the array list.
        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]
        Array list after removing all elements []*/

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {

    public UpdateArrayList() {
    }

    public static void main(String[] args) {

        List<String> fruits = new ArrayList(); //Created an array list

        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");
        System.out.println(fruits);

        fruits.set(0, "Kiwi"); //updating index 0 from apple to Kiwi
        fruits.set(2, "Mango"); //updating index 2 from Melon to Mango

        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
