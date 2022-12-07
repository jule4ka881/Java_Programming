package day21_multiDimensionalArray;
import java.util.Arrays;
public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}}; //maximum index number will be 2
        System.out.println(arr2D.length); //3
        System.out.println(Arrays.deepToString(arr2D)); //all of it
        System.out.println(Arrays.toString(arr2D[1])); //only array [4,5,6,7]
        System.out.println(arr2D[1][2]); // will return element 6
    }
}
