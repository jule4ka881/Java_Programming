package day22_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,20,10,20,15,25));
        System.out.println(list);
//as long as you know the exect element that you want to remove u can use this method
list.removeAll(Arrays.asList(10,20)); //remove 10 and 20
        System.out.println(list);


    }
}
