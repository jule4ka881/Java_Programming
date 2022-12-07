package day21_multiDimensionalArray;
import java.util.Arrays;
public class RemoveExtraSpaces {
    public static void main(String[] args) {

String str = "   Hello world      I     love     Java   ";


        //next step will be removing all the rest not needed ones

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));// will print all the elements of array

        str = "";      //this is array word
        for (String each : words) { //iterating each of the word and concate it to an empty string
            if(!each.isEmpty()){ // we need to find the element, represented by variable each, that is not empty(has a word)
                str +=each+" ";
            }
        }
        str = str.trim();//to remove the last space
        System.out.println(str);

    }

}
/*
Write a program that can remove all extra space from string
Ex:
   str="   Hello world      I     love     Java   "
   Output:
         Hello world I love Java
 */