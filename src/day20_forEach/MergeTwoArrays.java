package day20_forEach;
import java.util.Arrays;
public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] a1 ={10,20,30,40,50};
        int[] a2 ={60,70,80,90,100,110,120};

        int[] a3 = new int [a1.length + a2.length];

int k = 0;
        for (int each : a1) {
            a3[k++]=each;
        }
        for (int each : a2) {
            a3[k++] = each;
        }
        System.out.println(Arrays.toString(a3));
        System.out.println("------------------------------------------");
        String[] names = {"Mohammad Karimi", "Vasyl Dobri","Gadir Kay","Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "."+each.charAt(each.lastIndexOf(" ")+1));
        }
    }
}
