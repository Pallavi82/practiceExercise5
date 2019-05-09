package com.stackroute.pefive;

/*Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*/

import java.util.*;

public class SortRandomlyOrderedNames {

    public static void main(String[] args)
    {

        ArrayList<String> listArrayNames = new ArrayList<String>(); //created a list of strings

        listArrayNames.add("Harry");
        listArrayNames.add("Olive");
        listArrayNames.add("Alice");
        listArrayNames.add("Bluto");
        listArrayNames.add("Eugene");

        Collections.sort(listArrayNames); //Collection.sort method sorts the array list

        System.out.println("The ordered List :\n" + listArrayNames); //displays the ordered list

    }
}
