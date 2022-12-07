package day19_array;
import java.util.Arrays;
public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] names = new String[5];

        names [0] = "Gulcin";
        names[names.length-1] = "Aseel";
        names [2] = "Sumeve";
        names[1] = "Abidulah";
        names[3] = "Khashayar";

        System.out.println(Arrays.toString(names));

        names[1] = "Kuzzat";

        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------------");

        for (int i = names.length-1; i >= 0 ; i--) {
            System.out.println(names[i]);

            System.out.println("------------------------------------");



            }




        }
        
    }

