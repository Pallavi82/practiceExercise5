package com.stackroute.pefive;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MainTest {
    MainTest() {
    }

    public static void main(String[] args) {

        List<Student> listofstudents = new ArrayList(); //created aan array list

        listofstudents.add(new Student("1", "Arya", 18));
        listofstudents.add(new Student("2", "Sansa", 22));
        listofstudents.add(new Student("3", "Jon", 32));
        listofstudents.add(new Student("4", "Tyrion", 28));
        listofstudents.add(new Student("5", "Jaime", 32));

        Collections.sort(listofstudents, new StudentSorter()); //Collection.sort sorts the list of the array

        for(int i = 0; i < listofstudents.size(); ++i) {

            PrintStream var1 = System.out; //PrintStream adds functionality to another output stream

            String var2 = ((Student)listofstudents.get(i)).getID();

            var1.println(var2 + " " + ((Student)listofstudents.get(i)).getName() + " " + ((Student)listofstudents.get(i)).getAge());
        }

    }
}