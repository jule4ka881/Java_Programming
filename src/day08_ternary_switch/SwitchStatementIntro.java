package day08_ternary_switch;

public class SwitchStatementIntro {
    public static void main(String[] args) {

        char grade = 'Q';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");

        }

/*
A: Excellent
B: Great job
C: Good
D: Passed
F: Failed
 */
    }
}
