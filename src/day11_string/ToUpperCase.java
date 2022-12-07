package day11_string;

public class ToUpperCase {
    public static void main(String[] args) {

        String str2 = "java programming";
        str2 = str2.toUpperCase();  //"JAVA PROGRAMMING"

        System.out.println(str2);


        System.out.println("---------------------------------");

        String word = "Wooden Spoon";
        word = word.toUpperCase(); // "WOODEN SPOON"
        word = word.toLowerCase(); // "wooden spoon" //3 string objects
        System.out.println(word);

    }
}
