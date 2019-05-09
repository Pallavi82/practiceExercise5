package com.stackroute.pefive;


import java.util.Comparator;

class StudentSorter implements Comparator { //StdentSorter is a class implementing from interface named Comparator

    StudentSorter() {
    }

    public int compare(Object o1, Object o2) { //compare function containg two object parameters

        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if (s1.getAge() == s2.getAge()) { //checks if student 1 and student 2 has same age, if yes then comparison of names take place

            int answer = s1.getName().compareTo(s2.getName());
            return answer == 0 ? s1.getID().compareTo(s2.getID()) : answer; //tertiary operator used to return the id of the student whose name is prior to the other
        }
        else
            {
            return s1.getAge() > s2.getAge() ? 1 : -1; //tertiary operator used to return the age if not same
        }
    }
}
