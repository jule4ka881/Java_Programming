package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {
    public static void main(String[] args) {

        //elements index:0   1   2   0    1   2    0    1  2
     int[][] array = { {100,20,300},{10,1000,50},{-200,400,0}}; //indexes of array : 0~2
//                          0            1             2
int max = array[0][0]; //first element
        int min = array[0][0];

        //we need to find the number from all of the single dimensional arrays
        for(int[] each1D : array){
            for (int eachElement : each1D) {
                if(eachElement>max){
                    max = eachElement;
                }
                if(eachElement<min){
                    min = eachElement;
                }
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
