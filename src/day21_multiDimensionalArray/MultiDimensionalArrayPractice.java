package day21_multiDimensionalArray;
import java.util.Arrays;
public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"James","David","Daniel","Dauren"};
        String[] group2 = {"Kay","May","Olga"};
        String[] group3 = {"Lena","Anna","Mira","Masha","Natalie"};
        String[] group4 = {"Vitalik","Dima"};

        String[][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) { //each of the group
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) { //each name from groups
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }
        System.out.println("--------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }
        //mix for loop and for each loop
        System.out.println("-----------------------------------------");
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }
        }

        System.out.println("---------------------------------------------");
        System.out.println(groups);
        System.out.println(Arrays.deepToString(groups));
    }
}
