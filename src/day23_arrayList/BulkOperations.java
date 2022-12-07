package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


       list1.addAll(1,numbers);
        System.out.println(list1);

        System.out.println("-------------------------------------------------");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,85,95,70,80));
        System.out.println(scores);

        System.out.println("--------------------------------------------------");
        ArrayList<String> students= new ArrayList<>();
        students.addAll( Arrays.asList("Gadir","Hasan","Abidullah","Bilat") );
        System.out.println(students);

        students.addAll(2,Arrays.asList("Shukir", "Sumeye","Tatiana"));
        System.out.println(students);

        Integer[] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        //l1.add(ArraysList(nums));
        System.out.println(l1);

        System.out.println("-------------------------------------------------");

        ArrayList<String> employeesList =new ArrayList<>();
        employeesList.addAll(Arrays.asList("Sumeye","Alena","Mahmed","Gadir","Ali"));
        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        System.out.println("has Alena "+ hasAlena);
        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena","Gadir"));
        System.out.println(hasAlenaGadir);
        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar","Ali","Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat= " + hasMuhtarAliKuzzat);

        System.out.println("----------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,10,10,10,20,30,20));
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list); //all 10 and 20 will be removed

        System.out.println("-----------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Muhtar","Kuzzat","Asia"));
        developers.retainAll(Arrays.asList("Kuzzat")); //will retain, print only Kuzzat
        System.out.println(developers);


    }
}
