package day12_custoMethods;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0,email.indexOf("_")); //index of underscore


        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(rest);
        System.out.println(lastName +"_" + firstName + rest);
    }
}
