package day19_array;
import java.util.Arrays;
public class AlphabetAscending {

    public static void main(String[] args) {
                                    //26 letters
        char[] ascending = new char [26]; // index range 0~25


        for (int i = 0, j = 'A'; i < ascending.length; i++, j++) {
            ascending[i] = (char) j;

        }

        System.out.println(Arrays.toString(ascending));

        System.out.println("--------------------------------------");

        char[] characters = new char[65535];
        for(int i = 0; i < characters.length; i++){
            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));

    }
}
