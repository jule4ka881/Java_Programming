package day15_whileLoop;

public class SumOfEven {
    public static void main(String[] args) {
        for (int i = 50; i < 101 ; i++) {
           if(1 % 2 == 0){
               System.out.println(i + " ");
           }
        }
        System.out.println();
//50 is the first even number,52,54,56....100
        for (int i = 50; i < 101 ; i+=2) {

            System.out.println(i + " ");


        }
        System.out.println();
        for (int i = 50; i < 101; i++) {
            if( i % 2 !=0){// if i's value is odd number
                continue;
            }
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
//find the sum of all of the even numbers between 50-100