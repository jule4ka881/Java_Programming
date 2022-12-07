package day05_operators;

public class LogicalAndOperator {
    public static void main(String[] args) {

        int salary = 60000;
        int creditScore = 650;
        boolean isEligible = creditScore >= 650 && salary >= 30000;
        System.out.println("is eligible = " + isEligible);




    }
}
