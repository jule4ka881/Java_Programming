package day17_customClass;


public class UniqueCharactersBestApproach {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";
        //we need to compare a with every single character
        char ch = str.charAt(0); // verifying if the first character with index 0 is unique
        int frequency = 0; //we do not know how many times it will appear

        for (int i = 0; i < str.length(); i++) { //how mamy times the char has appeared in str
            if (str.charAt(i) == ch) { //if it's true we will increase it by 1, so first 2 times it will be true
                frequency++;//if equal first time frequency will increase by 1

            }
        }
        if (frequency == 1) { //if the frequency is equal to 1 then character is unique
            unique += ch;

        }
    }

}




//we cannot use lastIndexOf approach, find unique characters