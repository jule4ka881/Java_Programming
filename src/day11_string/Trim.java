package day11_string;

public class Trim {

    public static void main(String[] args) {

        String str4 ="     Cydeo School";
        str4 = str4.trim(); //"Cydeo School";
        System.out.println(str4);

        System.out.println("----------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w');
        System.out.println(index1);
    }
}
