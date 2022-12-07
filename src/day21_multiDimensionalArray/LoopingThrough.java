package day21_multiDimensionalArray;
import java.util.Arrays;
public class LoopingThrough {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //                   0        1          2
       //arr2D.fori ----> shortcut                      //outer loop
        for (int i = 0; i < arr2D.length; i++) {
              int[] arr1D = arr2D[i];
            System.out.println(Arrays.toString(arr1D)); //will print every single dimensional array
             //once we have single dimensional array we can apply for each loop to get each element
                                          // inner loop
            for (int j = 0; j < arr1D.length; j++) { //0~last element of each singledimensional array
                //we use the inner loop to iterate the elements of this single dimensional array that we got by using i
                //int[] arr1D = arr2D[i]
                // j is representing the index number of elements in each singledimentional array
                // so by using this j we can get each of the elements
                // so i now is the index number of each singledimensional array and
                //j is index number of each elements
                //so once we have this single dimensional array and j(index number of each element)
                //in order to get each element all we have to do is from single dimensional array we will call index j
                int element = arr1D[j];
                System.out.println(element);//it will return every single element
            }


            }
        }
    }

