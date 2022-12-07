package day10_string;


import java.util.Scanner; //String and system import statements are done implicitly


public class StringIntro {
    public static void main(String[] args) {

Scanner input = new Scanner (System.in); // scanners object
String str = "Java"; //string's object
        System.out.println();
        input.close();

        System.out.println("------------------------------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("-----------------------------------");

        String str1 = new String("Java"); // 2 objects: in string pool and in heap (Outside string)
        String str2 = new String();

        System.out.println( str1 == str2);

        System.out.println("----------------------------------");

        String t1 = "Python";  // go to the string pool
        String t2 = new String("Python"); // heap
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2); // not same objects
        System.out.println(t3 == t2);

    }
}
