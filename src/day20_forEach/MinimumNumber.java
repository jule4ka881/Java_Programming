package day20_forEach;

public class MinimumNumber {

    public static void main(String[] args) {

        int[] nums = {100,20,30,40,5,4,5,1,2,1000,300,500};
        int min = nums[0];
        for (int each : nums) {
            if(each<min){
                min = each;
            }
        }
        System.out.println("min =" + min);




    }
}
