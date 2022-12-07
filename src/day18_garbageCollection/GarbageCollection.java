package day18_garbageCollection;

import java.sql.SQLOutput;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null;
        System.out.println(s1);
        //to make it eligible for garbage collection --> s1 = null;
        //System.out.println(s1.toUpperCase());

        System.out.println("-------------------------------------");

        String str1 = "Python"; //Python is no longer an object
        str1 = "CYDEO";
        System.out.println(str1);

        System.out.println("---------------------------------");



    }
}
