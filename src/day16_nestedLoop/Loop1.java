package day16_nestedLoop;

public class Loop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { //each rows of data

            for (int j = 0; j < 10; j++) { //each columns
                System.out.println(" * ");//10 stars next to each other
            }
            System.out.println();

        }
        String str = "aabbccccd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if(each == str.charAt(j)){

                }
            }
        }
    }
}
