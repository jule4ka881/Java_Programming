package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "Cydeo"; //5 characters
        // maximum index number is 0

        char firstChar = str.charAt(0);
        char secondChar =str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("forthChar = " + forthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("---------------------------------------");

        String sentence = "Java programming language";
        int l = sentence.length();
        System.out.println(l);

        int lastIndex = l - 1;
        System.out.println(lastIndex);

        System.out.println("------------------------------");

        String s1 = "Java is the best programming language";
        char f = s1.charAt(0);
        int lastIndexNum = s1.length() - 1;
        char lastCharacter = s1.charAt(lastIndexNum);

        System.out.println(f + " : " + lastCharacter);

        //task: print first and last character of the String

        System.out.println("---------------------------------");

        String name1 = "Umran"; //string pool
        String name2 = new String("Umran"); //heap

        System.out.println(name1 == name2); // false: not the same person
//in order to check if they have same values we use equals

        System.out.println(name1.equals(name2));

        System.out.println("------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = "java";
        String r4 = new String("Java");


        System.out.println(r1 == r2); // one Java object in the pool
        System.out.println(r1 == r4); //false
        System.out.println(r2 == r4); //false
        System.out.println(r2 == r3); //false
        System.out.println(r1 == r3); //false
        System.out.println(r3 == r4); //false


        System.out.println(r1.equals(r4)); //just the text : true
        System.out.println(r2.equals(r4)); //true

        System.out.println("--------------------------------------");
        //if the person is eligible to vote

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt();
        System.out.println("Are you a US citizen?");
        String answer = input.next();

        if(age >= 21 && answer.equalsIgnoreCase("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }



    }
}
