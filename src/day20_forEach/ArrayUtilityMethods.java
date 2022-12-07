package day20_forEach;
import java.util.Arrays;
public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70,100,80,90,65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("------------------------------------------------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1);

        System.out.println("---------------------------------------------------");
        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'A','B','C'};
        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2);


        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","C","B"};
        System.out.println(Arrays.equals(s1,s2));

        System.out.println("------------------------------");

        int[] nums = {100,80,90,75,88,99,0,5,4,1000,500};
Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number : " +nums[0]);
        System.out.println("Maximum number :" + nums[nums.length-1]);


        System.out.println("---------------------------------------");
        String[] b1 = {"A","B","C"};
        String[] b2 = {"A","C","B"};// same elements, different order

        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1,b2));

        Arrays.sort(b1); //{A,B,C}
        Arrays.sort(b2); //{A,B,C}
        System.out.println(Arrays.equals(b1,b2));

        System.out.println("------------------------------------------------");
        String[] students = {"Yaxier","Madiyar","Ali","Abidulah","Alena"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------------");
        int[] array = {10,20,30,40,50,60,70};
        int[] array2 = Arrays.copyOf(array, 7); //if we put 4 will print till 50, not included
        System.out.println(Arrays.toString(array2));      //if 10 will give 3 more zeroes

        System.out.println("------------------------------------------------");

        int[] n1 ={1,2,3,4,5};
        int[] n2 ={6,7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);
        System.out.println(Arrays.toString(n3));

        System.out.println("------------------------------------------");

        char[] ch = {'A','B','C','D','E','F','G'};
                  //  0  1    2   3   4   5   6
        char[] result1 = Arrays.copyOf(ch,4);
        System.out.println(Arrays.toString(result1)); // [A,B,C,D]

        char[]result2 = Arrays.copyOfRange(ch, 2, 5); //[C,D,E]
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(Arrays.toString(result3)); //C,D,E,F,G

    }
}