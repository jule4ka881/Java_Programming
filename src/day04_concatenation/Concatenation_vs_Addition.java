package day04_concatenation;

public class Concatenation_vs_Addition {
    public static void main(String[] args) {

        System.out.println("32"+1);//32 is a string, so we will get a string 321
        System.out.println(7 + "1"); //will get string 71
        System.out.println("13" + "2");//will get 132 string

        System.out.println("--------------------");

        System.out.println(12 + 2.5); // 14.5
        System.out.println("-------------------");
        System.out.println("The value is " + true);

    }
}
