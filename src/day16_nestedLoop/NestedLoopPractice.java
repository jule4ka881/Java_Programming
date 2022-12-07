package day16_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {
        String str = "aaabbccccddeeeeff";
        String result = ""; //"bdf"

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //each character of str
            int count = 0; //count represents frequency
            for (int i = 0; i < str.length(); i++) { //responsible for comparing ch to each character of str
                if(str.charAt(i) == ch){
                    count++;
                }
            }

if(count == 2 && !result.contains(""+ch)){
    result += ch;
}

        }
        System.out.println(result);
        

        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
display characters that will appear twice in the string
 */