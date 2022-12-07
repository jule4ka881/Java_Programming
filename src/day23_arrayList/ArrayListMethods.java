package day23_arrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {

int[] array ={1,2,3,4,5};
array[0] = 100;
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------------");
//SET method - will not change the size of an array
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);
        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);

        //REMOVE method
        System.out.println("---------------------------------------------");
        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove("Oranges");
        System.out.print(groceriesList);
        System.out.println("--------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10); //0
numbers.add(20);//1
        numbers.add(40); //2
        numbers.add(50); //3
        numbers.add(30); //4

        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers); //10 will be removed from the ArrayList

            System.out.println("-----------------------------------");
            //CLEAR method
            numbers.add(10); //0
            numbers.add(20);//1
            numbers.add(40); //2
            numbers.add(50); //3
            numbers.add(30); //4

            numbers.clear();
            System.out.println(numbers.size());

            System.out.println("------------------------------------------");
            //IndexOf method
ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); //0
        names.add("Vasyl"); //1
        names.add("Irina");
        names.add("Sumeye");
            names.add("Ali");
            names.add("Sumeye");

            System.out.println(names.indexOf("Vasyl"));
            System.out.println(names.lastIndexOf("Vasyl"));
            System.out.println(names.lastIndexOf("Irina"));

            //CONTAINS method
        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");
        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);
    }
}
