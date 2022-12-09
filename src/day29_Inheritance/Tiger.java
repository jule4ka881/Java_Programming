package day29_Inheritance;

public class Tiger extends Animal {


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }



}
/*
Attributes:
         name, breed,size,age
    Actions:
         eat()
         move()
         toString()
         swim()
 */