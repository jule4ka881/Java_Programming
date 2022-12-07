package day21_multiDimensionalArray;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        //Anagram - string build out with the same letters as another string

String str1 = "heart"; //if we sort it aehrt
String str2 = "earth"; // if we sort it aehrt
//we have sort method in arrays

        char[] a1 =str1.toCharArray();
        char[] a2 = str2.toCharArray();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        //to sort them
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a1));

        boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println("isAnagram = " +isAnagram);

    }
}
/*
Ex: str1 = "heart"
    str2 = "earth" output:true

    str1 = "java"
    str2 ="python" output:false
 */