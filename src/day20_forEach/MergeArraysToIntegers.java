package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;
public class MergeArraysToIntegers {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] arr3 = new int [arr1.length + arr2.length]; //to combine 2 arrays, so it can have enough capacity
        
        int k = 0; //index numbers of the 3rd array
        for (int i = 0; i < arr1.length; i++, k++) { //getting all the elements of 1st array and assigns it to 3rd
             arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) { //for 2nd array's index numbers
            arr3[k] = arr2[i]; // we needed k for arr3
        }

        System.out.println(Arrays.toString(arr3));


        System.out.println("-----------------------------------");

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {70,80,90};

int[] a3 = ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------------");

        double[] b1 = {10.5,5.5,3.5,6.5,8.5};
        double[] b2 = {20.5,15.5,13.5};

        double[] b3 = ArraysUtility.merge(b1,b2);
        System.out.println(Arrays.toString(b3));


        System.out.println("----------------------------------------------");

        char[] ch1 = {'A','b','c','D','e'};
        char[] ch2 = {'N','T'};

                char[] ch3 = ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));


        System.out.println("-------------------------------------------------");

        String[] str1 = {"Wooden","Spoon"};
        String[] str2 = {"Is","Very","Cool","Name"};

        String[] str3 = ArraysUtility.merge(str1,str2);
        System.out.println(Arrays.toString(str3));
    }


}
/*
write a program that can merge two arrays of integers
Ex:
   arr1 = {1,2,3,4}
   arr2 = {5,6}
   output
         arr3 = {1,2,3,4,5,6}
 */