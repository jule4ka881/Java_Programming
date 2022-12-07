package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

     int score = 95;
     String r = "Your grade is: "; // so we don't print it 5 times
     if(score >= 90){ //false: score < 90
         r="A";
     }else if(score >= 80){ //false: score < 80 and score is already less then 90
         r="B";
     }else if(score >= 70){ //false: score < 70
         r="C";
     }else if(score >= 60){ //false: score < 60
         r="D";
     }else{
         r="F";
     }
        System.out.println(r);


    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:

score = 95

output:
Your grade is A

Note: Assume that the given score is between 0 ~ 100
 */