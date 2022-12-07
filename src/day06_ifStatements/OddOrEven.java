package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 45;
        boolean isEven = 45 % 2 == 0; // when we divide a number by 2,if the remainder is 0 it means even
        System.out.println(isEven);

        // boolean isOdd = number % 2 !=0; // number divided by 2 , if the remainder is NOT zero- it's odd

        boolean isOdd = !isEven; // if the number is not even - it's odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an even number: " + isOdd);
    }
}
