package day19_array;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] numbers = {100,20,500,40,-10,30};

        int max = numbers[0]; //assumption that first index is maximum number 100
        for (int i = 1; i < numbers.length; i++) { //will start from index 1 ----- 20 ---false
            if(numbers[i] > max){
                max = numbers[i]; //when it compares to 500 will asign it cause it's greater than 100


            }
        }

        System.out.println("max = " + max);


    }


}
