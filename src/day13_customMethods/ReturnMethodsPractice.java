package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {
        System.out.println(isOdd(100));
        System.out.println(isEven(199));
        System.out.println(maxNumber(19,23));
        System.out.println(minNumber(2,1));
    }

    public static boolean isOdd(int num){
return (num%2 !=0)?true : false;

    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static int maxNumber(int n1, int n2){
        return n1 > n2 ? n1:n2;
    }

    public static int minNumber(int num1, int num2){

        return num1 < num2 ? num1:num2;
    }
}
/*
Create a method named isOdd, that can return true if a number is an Odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */