package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {
        int number = 100;
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("----------------------------------");

        int n = 1;
       String day = "";
        if(n == 1){
day = "Monday";
        }else if(n == 2){
            day = "Tuesday";
        }else if(n == 3){
            day = "Wednesday";
        }else if(n == 4){
            day = "Thursday";
        }else if(n == 5){
            day = "Friday";
        }else if(n == 6){
            day = "Saturday";
        }else{
            day = "Sunday";
        }


    }
}
