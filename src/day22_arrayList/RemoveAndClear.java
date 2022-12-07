package day22_arrayList;
import java.util.ArrayList;
public class RemoveAndClear {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Java");
        list.add("Ruby");
        list.add("C++");
        list.add("Java");
        System.out.println(list);

        //we want to remove second Java:

        list.remove(3); //or list.remove(o:"java);  object
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
