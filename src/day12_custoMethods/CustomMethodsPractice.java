package day12_custoMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {


maxNum(10000,5000);
        System.out.println("-----------------------------");
        maxNum(10.5, 20.5);
        System.out.println("------------------------------");
        maxNum(15,35);
        System.out.println("-------------------------------");
        initial("Mohammed", "Khan");
        System.out.println("-------------------------------");
        initial("Hasan", "Ayhan");

    }
    //create a method that can print the maximum number between two numbers, if both r equal then it prints equal, (num1, num2)
    public static void maxNum(double num1,double num2){

        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }
    }

    //create a method that can display the initials of a person (firstName, lastName)
    public static void initial(String firstName, String lastName){
        String initial = firstName.charAt(0) +"." + lastName.charAt(0);
        System.out.println("initial = " + initial);
    }

//create a method that can calculate the grade of the students (score)




}
