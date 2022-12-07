package day22_arrayList;
import java.util.ArrayList;
public class IteratingArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(100);
numbers.add(200);
numbers.add(300);
numbers.add(400);
numbers.add(500);
numbers.add(3,255);
        System.out.println(numbers);//{100,200,300,255

        for( int i = 0; i< numbers.size(); i++) {
            int each = numbers.get(i); //will get first number during first iteration
                            //second number during second iteration and so on till the end
            System.out.println(each);

            System.out.println("--------------------------------------------");
            for (int i1 = numbers.size() - 1; i1 >= 0; i1--) {
                System.out.println(numbers.get(i1));
            }
        }
    }
}
