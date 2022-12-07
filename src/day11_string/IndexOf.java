package day11_string;

public class IndexOf {
    public static void main(String[] args) {

        String sentence = "Today is Sunday, and we have Java class";
        int index1 = sentence.indexOf('w');
        System.out.println(index1);;

        String s1 = "I love Java Programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        //second A ======>
        int secondA = s1.indexOf("a ");

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1);
        int a2= s2.indexOf("a Python");
        System.out.println(a2);
        int a3 = s2.indexOf("avaS");
        System.out.println(a3);
        int a4 = s2.indexOf("aS");
        System.out.println(a4);

        System.out.println("------------------------------------");

String w = "Java";
        System.out.println(w.indexOf('a')); //1
        System.out.println(w.lastIndexOf('a')); //3

        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('P'));


    }
}
