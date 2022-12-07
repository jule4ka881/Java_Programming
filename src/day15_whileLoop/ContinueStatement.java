package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6 ; i++) {

            if(i==4){ //skips iteration 4
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        for (int i = 10; i < 21 ; i++) {

            if(i % 2 == 0){
                continue; //skips the current iteration, excluding even numbers
            }

            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for(char i = 'A'; i <= 'G'; i++){
            if(i == 'B') // will skip B
                continue;
            if( i == 'E')
                continue;

            System.out.println(i);
        }
    }
}
