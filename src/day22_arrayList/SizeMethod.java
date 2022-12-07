package day22_arrayList;

import java.util.ArrayList;

public class SizeMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new  ArrayList<String>();

        list.add("Cydeo");
        list.add("Java");
        list.add("SDET");
        //to put element into index 1
        list.add(1,"Python");

        int totalElements = list.size();
        System.out.println("totalElements = " + totalElements);

//GET method
        System.out.println(list.get(2)); //Java
    }
}
