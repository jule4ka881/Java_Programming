package day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
public static String name;
public int age;
public char gender;
public LocalDate birthday;
public boolean isMarried;
public boolean isEmployed;

    public Person(String name,int age, char gender, LocalDate birthday, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.birthday = birthday;
    }

    public Person(String name, int age, char m, String s, boolean isMarried, boolean isEmployed) {
    }

    public String toString() {
        return "Person{" +"name ="+
                "age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                "birthday ="+ birthday.format(DateTimeFormatter.ofPattern("MMMM/dd/y"));
                
        
    }
}
/*
name
age
gender
dateof Birth
isMarried
isEmployed
create toString method (date of birth is formatted)
add a constructor that can set all the fields once and object is created
toString(),eat(String food),sleeping(),drink(String drink)
create 5 person objects

 */