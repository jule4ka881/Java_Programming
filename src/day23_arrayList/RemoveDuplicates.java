package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); //0
        names.add("Vasyl"); //1
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : names) {
            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }
        names = nonDup;
        System.out.println(nonDup);
        System.out.println(nonDup);

        System.out.println("----------------------------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;
        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l2.add(10);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));

    }


}
