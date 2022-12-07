package day27_AccessModifiers;

public class StaticBlock {

    //if we have constructor here
    public StaticBlock(){
        System.out.println("Constructor");
        //it will get executed 3 times if we create 3 objects
        //but after static block and main method
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }
    static{
        System.out.println("Static Block");
       //we need main method here, before java 8 didn't
        //static block will get executed no matter if it's before or after main method
    }
}


//before java 8 we could run the code without main method, just with the static block