package day20_forEach;
import utilities.ArraysUtility;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reverse =new int[array.length]; // {5,4,3,2,1}
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            reverse[j] = array[i]; //last array will be assigned to index 0, second array to index 1 and so on
            //start index 0   start last index
            //increased        decreased
            //forward          backward direction
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("--------------------------------------------");

        int[] nums = {100,200,300,400,500};
        nums=ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------------");
        double[] a1 = {1.5,2.5,3.5,4.5};
        a1 = ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));

        System.out.println("-------------------------------------------------");

        char[] ch1 = {'a','b','c','d','e','f','g'};
        ch1 = ArraysUtility.reverse(ch1);
        System.out.println(Arrays.toString(ch1));
    }
}
/*
write a program that can reverse an array of integers and returns it as new array
ex:
   array = {1,2,3,4,5};
   output :
           reversedArray ={5,4,3,2,1};
 */