package day27_AccessModifiers;

public class InstanceBlock {
//instance block:

    {
        System.out.println("Instance Block"); //gets executed as many times as many Objects r created
                                              //then Constructor gets executed
    }
    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();

    }
}
