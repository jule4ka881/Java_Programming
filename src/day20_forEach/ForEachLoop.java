package day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        for( int each : numbers  ){ // will get executed 5 times, cause it's fixed
            System.out.println(each); // simpler than for loop
        }

        System.out.println("-----------------------------------------");



    }
}
