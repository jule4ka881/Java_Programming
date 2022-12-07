package day07_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int num = 20;
        String result = ""; //temporary value

        if (num > 0) { //if true, there is no point to check the remaining cond
            result = "Positive";
        }
        if (num < 0) {
            result = "Negative";
        }
        if(num == 0){
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("-------------------------------");
        String result2 = "";

        if (num > 0) {
          result2 = "Positive";
        } else if (num < 0) {
            result2 = "Negative";
        } else {
            result2 = "Zero";
        }
        System.out.println(result2);





    }

}