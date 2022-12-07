package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc"; // we can't change it cause it's immutable
        String result = ""; //to store final result "abc"

        for (int i = 0; i < str.length() ; i++) { // i: index numbers of str
            System.out.println(str.charAt(i));

            char each = str.charAt(i); // each character of the string

            if(!result.contains("" + each)){ //if the string result does not contain the character of string

            result += each; //str yet, then we will add that character to the string result
            }
            //if the character is not contained yet in the new string, then we will add it to the new string
        }
        System.out.println(result);

    }
}
/*
Write a program that can remove all of the duplicated characters from a string
Ex:
   str = "aabbbcccc"
   output:
          abc
 */