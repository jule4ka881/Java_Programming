package day08_ternary_switch;

public class NestedIfIntro {
    public static void main(String[] args) {

        int n = 5;
         //1~7
        String day = (n >= 1 && n <= 7) ?
                (n == 1)? "Monday":(n ==2)?"Tuesday":(n ==3)?"Wednesday"
                        :(n == 4)? "Thursday":(n ==5)?"Friday"
                        :(n==6)? "Saturday":"Sunday"
                    : "No such a day";
        System.out.println(day);


    }
}




