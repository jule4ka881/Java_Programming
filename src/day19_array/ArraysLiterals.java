package day19_array;
import java.util.Arrays;
public class ArraysLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];
int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("----------------------------------------------");
         //elements         1       2          3           4        5         6          7
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //indexes          0       1         2           3         4         5         6
        int n = 1;
        System.out.println( days[n-1] );


        System.out.println("-------------------------------------------------");

        String[] months ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

         System.out.println("Months = " + Arrays.toString(months));
    }
}
