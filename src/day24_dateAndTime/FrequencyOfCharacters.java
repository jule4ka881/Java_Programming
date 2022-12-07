package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        String result = "";              //a3b4c5
        //create collection out from the string, so we will do it through array
        //you can create array out from the string
        for (String each : str.split("")) {
           int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

           if(!result.contains(each)){ //we created this in order to print the letter only 1 time
               result += each + frequency;
           }
        }
        System.out.println(result);
    }
}
