package day16_nestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon"); // 5 times
        }

        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {   //outer loop  // i:0

            for (int j = 0; j < 5; j++) {     //inner loop
                System.out.println("Wooden Spoon"); // 5 times

        }

        }
    }
}
