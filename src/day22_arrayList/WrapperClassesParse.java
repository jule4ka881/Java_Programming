package day22_arrayList;

public class WrapperClassesParse {
    public static void main(String[] args) {

        String str = "12";
        System.out.println(str + 1); //121, concatenation
        // we will use PARSE method to convert string to the primitive data type
        //to get 13 not 121
        int a = Integer.parseInt(str); //this parse method will convert str to Integer
        //we have to assign it to int a
        System.out.println(a); //12
        System.out.println(a+1); //13
        //we can call this parse method from any wrapper classes


        String str2 = "0.5";
        double b = Double.parseDouble(str2);
        System.out.println(b); //0.5 as primitive
    }

}
