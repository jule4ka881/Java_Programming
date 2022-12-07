package day21_multiDimensionalArray;
import utilities.ArraysUtility;

import java.util.Arrays;
public class AddElements {

    public static void main(String[] args) {

        int[] array =  {1,2,3,4,5};
        int element = 6;

        int[] new_array = Arrays.copyOf(array, array.length+1);
        new_array[new_array.length-1] =element;
        //{1,2,3,4,5,6} impossible, if we want this result we need a new array
        System.out.println(Arrays.toString(new_array));

        System.out.println("-----------------------------------------");

        int[] numbers = {100,90,80,70,60};
        numbers = ArraysUtility.addElement(numbers,50); //will return us new array object
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------------------");

        double[] nums = {1.5,2.5,3.5,4.5};
        nums = ArraysUtility.addElement(nums,5.5);
        nums = ArraysUtility.addElement(nums,6.5);
        nums = ArraysUtility.addElement(nums,7.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------");
        String[] students = { "Yasin", "Sumeye","Ermek"};
        students = ArraysUtility.addElement(students,"Umran");
        System.out.println(Arrays.toString(students));

    }

}
