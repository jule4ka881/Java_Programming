package day20_forEach;
import utilities.ArraysUtility;

import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("--------------------------------------");

        String str2 = "Today is a great day to learn java";
         String[] words= str2.split(" "); //will split 7 times
        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------");

        String sentence = "I love Java"; // "Java love I"
        String[] arr = ArraysUtility.reverse(sentence.split(" ")); //[I, love,Java]
        String reversedSentence = "";//"Java love I" ----> we need this
        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i]+ " ";
        }
        System.out.println(reversedSentence);
    }
}
