package day22_arrayList;
import java.util.ArrayList;
public class IndexOfAndlastIndexOf {
    public static void main(String[] args) {


        ArrayList<String> list = new  ArrayList<String>();

        list.add("Cydeo");
        list.add("Java");
        list.add("SDET");
        list.add("Cydeo");
        list.add("Java");
        list.add("SDET");

        int index1 =list.indexOf("SDET");
        int index2 = list.lastIndexOf("SDET");
        System.out.println(index1); //2
        System.out.println(index2); //5 last object SDET in the list
    }
}
