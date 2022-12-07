package day19_array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int [total]; // length will be set to 5
int sum = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter the number:");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        double average = sum/(double)total;


        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);  //7 numbers 11,12,13,14,15,1,6
    }
}
/*
ask user how many numbers they want to enter
get all the inputs from the user and store them into an array
iterate the array and return the average number
 */