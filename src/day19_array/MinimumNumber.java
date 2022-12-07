package day19_array;

public class MinimumNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,-10,30};
        int min = numbers[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("min = " + min);

    }
}
