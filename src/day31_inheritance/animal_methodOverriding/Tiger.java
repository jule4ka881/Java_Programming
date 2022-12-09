package day31_inheritance.animal_methodOverriding;

public class Tiger extends Animal{


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){

        System.out.println("Tiger "+getName()+" is eating tiger food");
    }
}
