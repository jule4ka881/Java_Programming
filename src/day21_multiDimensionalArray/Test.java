package day21_multiDimensionalArray;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inhabitants = input.nextInt();
        int day = 0;
        if (inhabitants == 0) {
            System.out.println("----EXTINCT----");

        }
        do {

            System.out.println("day" + day + "[" + inhabitants + "]");
            day++;
            inhabitants = inhabitants / 2;
        } while (inhabitants > 0);
        System.out.println("");
        if (inhabitants == 0) {
            System.out.println("----EXTINCT----");

        }
    }
}