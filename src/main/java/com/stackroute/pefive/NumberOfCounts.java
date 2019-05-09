package com.stackroute.pefive;

/*2. Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfCounts {

    public NumberOfCounts() { //Constructor named NumberOfCOunts
    }

    public static void main(String[] args) {

        Map<String, Integer> countMapping = new HashMap();

        Scanner s = new Scanner(System.in);
        System.out.print("String str= ");
        String str = s.nextLine();

        str = str.replaceAll("[^a-zA-Z]", " "); //replacing all a to z, A to Z characters with null string

        String[] str1 = str.split("\\s+");
        String[] var = str1;
        int var1 = str1.length; //var1 stores the length of the string

        for(int var2 = 0; var2 < var1; ++var2) {
            String str2 = var[var2];

            int count;
            if (countMapping.containsKey(str2)) {  //checks if countMapping contains string2

                count = (Integer)countMapping.get(str2) + 1;
            } else {
                count = 1;
            }

            countMapping.put(str2, count);
        }

        System.out.println(countMapping); //displays the count
    }
}
