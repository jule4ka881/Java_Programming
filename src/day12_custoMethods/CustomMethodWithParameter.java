package day12_custoMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(100);
        eligibleOrNot(22);

        oddEvenZero(99);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }

    public static void eligibleOrNot(int age) {

        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are underage");
        }
    }

    public static void oddEvenZero(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else if(number % 2 != 0) {
                System.out.println(number + " is odd");
        } else {
                System.out.println(number + " is zero");

            }
        }
    }
