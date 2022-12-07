package day15_whileLoop;

public class RemoveDuplicatesEasy {
    public static void main(String[] args) {

String str = "xyzxyzxyz"; // need new string object
        String result = "";

        for (int i = 0; i < str.length(); i++) {



            if( result.contains(""+str.charAt(i) )){ //if the character is already contained in new string
                continue; //skip it
            }
result += str.charAt(i);
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