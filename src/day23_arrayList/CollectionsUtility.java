package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,7,6,5,4,4,3));
        int max = Collections.max(list); //unboxing
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-----------------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange"));

        Collections.sort(items);
        System.out.println(items);

        System.out.println("-------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("--------------------------------------------------------");
ArrayList<String> students = new ArrayList<>();
students.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));

Collections.swap(students,1,0);
        System.out.println(students);

   Collections.swap(students,0,students.size()-1);
        System.out.println(students);
    }
}
