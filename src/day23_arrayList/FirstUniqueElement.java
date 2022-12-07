package day23_arrayList;
import java.util.ArrayList;
public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        for (Integer element : list) { //frequency of all the elements

            int frequency = 0;// we want to find the frequency of this element

            for (Integer each : list) {// to get each element of the list
                if (each == element) {
                    frequency++;
                }

            }
            if (frequency == 1) { //if the frequency is equal to 1 we need to print this element
                System.out.println(element);
                break; // exiting the loop, in order to return the first unique element
            }
        }
    }
}
/*
write a program that can return the first unique elements from an arrayList
Ex:
   ArrayList = {1,1,2,3,4,5,}
   output:
          2
 */