package day21_multiDimensionalArray;
import java.util.Arrays;
public class LoopingThroughAMultiDArrayReversed {
    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //                   0        1          2
        for (int i = arr2D.length - 1; i >= 0; i--) {
          int[] arr1D = arr2D[i];
            System.out.println(Arrays.toString(arr1D));

            for (int j = arr1D.length - 1; j >= 0; j--) {
                int element = arr1D[j];
                System.out.println(element);
            }
        }
    }
}
