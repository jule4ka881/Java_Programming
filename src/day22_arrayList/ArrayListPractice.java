package day22_arrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> list = new  ArrayList<String>();

        list.add("Cydeo");
        list.add("Java");
        list.add("SDET");
        //to put element into index 1
        list.add(1,"Python");
        System.out.println(list);

    }
}
