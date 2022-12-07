package day21_multiDimensionalArray;
import java.util.Arrays;
public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 10}};

        for (int i = 0; i < arr2D.length; i++) { // i:  index number of 1D array in arr2D
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < each1D.length; j++) { //j:index number of elements in each 1D array of arr2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("--------------------------------------------------");
        //forEach loop
        for( int[]each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray)); //for single arrays

            for(int[] eachElement : arr2D){
                System.out.println(eachElement); //for each element in those arrays

            }
            System.out.println("------------------------------------------------");
            for( int i = arr2D.length-1; i >= 0; i--){
                for(int j = arr2D[i].length-1; j>=0;j--){
                    System.out.println(arr2D[i][j]);
                }
            }

            System.out.println("---------------------------------------------------");

            for (int[] each1D : arr2D) {
                for (int eachElement : each1D) {
                    System.out.println(eachElement);
                }

            }

            }
        }
    }
