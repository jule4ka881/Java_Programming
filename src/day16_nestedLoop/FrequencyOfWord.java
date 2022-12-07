package day16_nestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
String word = "Java";

//if we wanna ignore case sensitivity
        //sentence = sentence.toLowerCase();
        //word = word.toLowerCase();

int count = 0; //we want this word to contain the frequency of Java (increase count by 1)

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word,""); //"Java Java Java
            //while loop will stop when there is no more java in the sentence
        }


        System.out.println(count);
    }
}
/*
frequency of the word java from a sentence
Ex:
    sentence = "Java Java Java Java" //count = 0 ,every time Java is removed count will be increased by 1
                "Java Java Java" //count = 1
                "Java Java" // count = 2
                "Java" // count = 3
                "" //count = 4
    output:
           4
 */