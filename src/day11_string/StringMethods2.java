package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence ="I love Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        System.out.println("------------------------------------------");

        String word = "java";
        // word = word.replace('a','e'); //"jeve"
        word = word.replace ("a","e");
        System.out.println(word);

        System.out.println("-------------------------------------");


        String sentence2 = "I love Java, Java is cool";
       // sentence2 = sentence2.replace("Java","Python");
        sentence2=sentence2.replaceFirst("Java","Python");
        System.out.println(sentence2);


        System.out.println("--------------------------------------");
        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3= sentence3.replaceFirst(", Java",", Python");
        System.out.println(sentence3);


    }
}
