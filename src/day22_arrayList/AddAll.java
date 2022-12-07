package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAll {
    public static void main(String[] args) {
        //if you wanna add all elements into another array list

        ArrayList<Integer> list1 = new ArrayList<>(); //creating ArrayList object
        //does not support primitives!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        list1.add(10);// index: 0
        list1.add(20);// 1
        list1.add(30);// 2
        list1.add(40);// 3
        list1.add(30);// 4  //we need to insert: list.add(1,15) - will add 15 to index 1
list1.add(1,15);
        System.out.println(list1); //inserted 15, the rest shift to the side

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        System.out.println(list2);

        //add all the list1 elements into list2

        list2.addAll(list1);
        System.out.println(list2);
        ArrayList<Integer> list3 = new ArrayList();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list3);

        System.out.println("----------------------------------------");
        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);
        String firstStudent = studentsList.get(0);

        String lastStudent = studentsList.get(studentsList.size()-1 );//last element

        System.out.println(firstStudent);
        System.out.println(lastStudent);
    }
}
