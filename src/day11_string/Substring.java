package day11_string;

public class Substring {


    public static void main(String[] args) {

        String str = "Cydeo School";
        str = str.substring(0,  4+1);
        System.out.println(str); // getting just Cydeo

       String sentence4 = "I love Java Programming";
       int index1 =sentence4.indexOf('J');
       int index2 = sentence4.indexOf("a P");
        System.out.println(index1);
        System.out.println(index2);

        String languageName = sentence4.substring(7, 10+1);
        System.out.println(languageName);

        System.out.println("-----------------------------------------");

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
                String today = sentence5.substring(9, 14+1); // or 15
        System.out.println(today);

        System.out.println("----------------------------------------------");

        String email = "CydeoSchoolJavaProgramming@yahoo.com";
        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        System.out.println("-----------------------------");

        String sentence6 = "I love Java programming";
        //String r1 = sentence6.substring(7, sentence6.length());
        String r1 = sentence6.substring(7);
        System.out.println(r1);
        System.out.println("----------------------------------");
        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tomorrow);

        System.out.println("-------------------------------------");
        String sentence8 = "I study at Cydeo School";
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);



    }
}
