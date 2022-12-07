package day05_operators;

public class LogicalOrOperator {
    public static void main(String[] args) {

        String answer = "yes";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C'
                || grade == 'D';
        System.out.println(passedTheExam);
    }
}
