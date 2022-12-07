package day16_nestedLoop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

String sentence = "AAABBCCCCDDDDD";
String result = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int count = 0;
            for(int j = 0; j<sentence.length();j++){
                if(sentence.charAt(j)==ch){
                    count++;
                }
            }

            System.out.println(count);
        }



    }
}
/*
Frequency of characters:
"AAABBCCCCDDDDD"
output:
        A3B2C4D5
 */