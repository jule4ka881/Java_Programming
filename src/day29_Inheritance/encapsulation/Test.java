package day29_Inheritance.encapsulation;

public class Test {
    public static void main(String[] args) {


        String str = "Hello";
        int strLength = str.length();
        char lastChar1 = str.charAt(strLength-2);
        char lastChar2 = str.charAt(strLength - 1);
        String newString = lastChar1 + "" + lastChar2 + lastChar1 + "" +lastChar2 +
                lastChar1 + "" +lastChar2;
        System.out.println(newString);
    }

}
