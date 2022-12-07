package day22_arrayList;
import java.util.ArrayList;
public class Contains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Java");
        list.add("Ruby");
        list.add("C++");
        boolean hasC = list.contains("C++");
        System.out.println("hasC = " + hasC);



    }
}
