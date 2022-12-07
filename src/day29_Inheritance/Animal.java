package day29_Inheritance;

public class Animal {
    public String name;
    public String breed;
    public int age;
    public String size; //later on those attributes will be inherited to the other classes

    //common methods

    public void eat(){
        System.out.println(name + " is sleeping");
    }
    public void move(){
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
 Animal
			attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */
