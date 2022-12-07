package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import utilities.ArraysUtility;

import java.util.Arrays;

public class RetainAll {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,20,10,20,15,25));
        System.out.println(list);

        list.retainAll(Arrays.asList(10,20));
        System.out.println(list);
    }
}
