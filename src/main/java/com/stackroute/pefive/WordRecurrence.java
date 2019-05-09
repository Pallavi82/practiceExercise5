package com.stackroute.pefive;

/*3. Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array

Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}

Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/

import java.util.HashMap;
import java.util.Map;

public class WordRecurrence {

    public WordRecurrence() { //Constructor of WordRecurrence
    }

    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b", "c", "d", "a", "c", "c"}; //string array
        Map<String, Boolean> recurrence = new HashMap();
        Map<String, Integer> countElement = new HashMap();

        String[] var = arr;
        int var1 = arr.length; //var1 stores length of array

        for(int var2 = 0; var2 < var1; ++var2) {

            String str = var[var2];
            int count;

            if (countElement.containsKey(str)) { //checks if the element is there in the string
                count = (Integer)countElement.get(str) + 1;
            } else {
                count = 1;
            }

            countElement.put(str, count);
            if ((Integer)countElement.get(str) > 1) { //checks if the element in the string is more than once, if yes then returns true, else false
                recurrence.put(str, true);
            } else {
                recurrence.put(str, false);
            }
        }

        System.out.println(recurrence);
    }
}
