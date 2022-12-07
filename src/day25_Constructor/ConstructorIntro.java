package day25_Constructor;

public class ConstructorIntro {
//defining constructor by ourselves
    public ConstructorIntro(){ //this is a default Constructor
        //if we define constructor by our selves, we will be able to group a certain code fragments that can
        //execute certain task within the body of the constructor
        System.out.println("Object is created by using default constructor");
    }


    public static void main(String[] args) {
//if there is constructor in this class (and there is, cause constructor is a must for every class)
        //there is (default) no argument constructor here,doesn't pass any parameters
        //we can create an object now, using this constructor:

        new ConstructorIntro();
//as soon as we create this object, the code fragment that we used after the default constructor was created
        //gets executed at the same time
        //we will be able to set all the instances at the same time, like with setInfo method(but we have to call it manually
        //so Constructor is much better and faster ( cause it's done automatically)

    }
}
