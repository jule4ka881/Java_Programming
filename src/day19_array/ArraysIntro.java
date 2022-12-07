package day19_array;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {
        //declared variable //instantiating an object
        int[] scores = new int[5]; // the size has to be set all the time
                                    //if we want 5 elements we have to set it to 5
        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;
                       //scores[5] = 100; --->>> index autoban exception
       // scores = new int[10]; //index: 0~9
        //scores = new int[50]; //index: 0~49, the old object will be eligible for garbage collection
        System.out.println( Arrays.toString(scores) );
        System.out.println( scores[2] );

        System.out.println("-------------------------------------------------");
                           //scores.length
        for (int i = 0; i < scores.length; i++) { //i: index numbers of scores array
            System.out.println(scores[i]);
            System.out.println("------------------------------------");

            System.out.println(scores[scores.length-1] );
        }

    }
}
