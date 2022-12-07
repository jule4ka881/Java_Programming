package day11_string;

public class BooleanReturnTypeMethods {
    public static void main(String[] args) {
        // isEmpty Method

        String word = "Java";
        boolean r1 = word.isEmpty();
        System.out.println(r1);  //if it was "" -true

        // isBlank Method

        String str = "     ";
        boolean r2 = str.isEmpty();  //if the length = 0, it's empty
        boolean r3 = str.isBlank();
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        // equals Method

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        System.out.println(str1 == str2); //different objects
        System.out.println(str1.equals(str2)); // same values

        //equals Ignore Method

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));  //true

        //contains Method

        String students = "Hasan Naran Sumeve Nataliia";
        boolean hasAhmad = students.contains("Ahmed");
        System.out.println("hasAhmad = " + hasAhmad);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);

        //starts With
         String name = "Michael";
         boolean l = name.startsWith("Da");
        System.out.println(l);  // false

        String url = "www.cydeo.com"; //to verify if this website is valid
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);  //true

       // endsWith
String url1 = "www.cydeo.com";
boolean isValid1 = url1.endsWith(".com");
        System.out.println(isValid1); //will check last 4 characters

        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);



    }
}
