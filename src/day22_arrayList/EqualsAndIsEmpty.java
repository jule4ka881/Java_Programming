package day22_arrayList;
import java.util.ArrayList;
public class EqualsAndIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Java");
        list1.add("C++");
        list1.add("Python");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Java");
        list2.add("C++");
        list2.add("Python");

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(list1==list2); //will be false cause they r not the same objects
        System.out.println(list1.equals(list2));

        System.out.println(list1.isEmpty());





    }
}
