package day28_Encapsulation.encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name) { // Allows us to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) { // Allows us to create Person object just by setting the name & age of the person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) { // Allows us to create Person object just by setting the name & language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {  // Allows us to create Person object just by setting the name & gender of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {  // Allows us to create Person object just by setting the name , age and gender of the person
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) { // Allows us to create Person object just by setting the name, age, gender and language of the person
        this(name, age, gender);
        this.language = language;
    }


    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;

        // name = "Josh";
    }


    public static void printPlanetName() {
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }


}
/*
Variables:
name,age,gender,dateOfBirth ( vars need to be private )

name:
Write: can not be blank/null/empty
Read: if name is not, return "unknown" instead
age: Write: age can not be less than zero or greater than 120
gender: write(set) can only be for male or female
DOB: Write: can not be after today's date
add constructor that can set all those fields
add toString method
 */