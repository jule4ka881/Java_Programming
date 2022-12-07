package day17_customClass;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";


        String unique = "";

        for (int i = 0; i < str.length(); i++) { //i: index number of string str
            char each = str.charAt(i); //each time will be different i, will increase by 1

            if (str.indexOf(each) == str.lastIndexOf(each)) { //will determine if character is unique
                unique += each; //if the first time character appeared in the string is equal to
                                //the last time this same character appeared inside the string

            }
        }
        System.out.println(unique);
    }
}

/*
Write a program that can find the unique characters from a string
Ex: str = "aabcccd"
    output: bd
 */