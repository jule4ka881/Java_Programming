package day17_customClass;

public class Dog {
public String name; //instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;


    //creating a method     //"Max,"Husky,              "small"            'M',  2,     "White"
    public void setInfo(String name, String breed, String size, char gender, int age,String color){ //local variables
      this.name = name; //to call instance variable, cause ---->   //by default it will call local variable so
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
//this method will help us to create all the information of the dog
    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() { //to avoid hash code when we print class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void drink(){
    System.out.println(name + " is drinking water");



}
}//we have 6 instance variables and 2 instance methods