package day16_nestedLoop;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabbbccccccccccccccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { //i:index numbers of str
            if(str.charAt(i) == ch){  //if the character of the string is equal to given character
                                         //then it means given character appeared in the string
                count++; //when 'c' appears again increase it by 1
            }

        }
        System.out.println(count);


    }
}
/*
write a program that can return frequency of character from a string
Ex:
     str = "aaabbbbccccc"
     ch = 'c'

     output:
     5
 */