package day22_arrayList;
import java.util.ArrayList;
import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
//we want to change 30 to 300
list.set(2, 300);
//just updates the element, same size
        System.out.println(list);

    }


}
