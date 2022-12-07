package day27_AccessModifiers;

public class StaticBlockVsInstanceBlockVsConstructor {

    public StaticBlockVsInstanceBlockVsConstructor() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block"); //will get execute depends on how many objects will be created
    }

    static{
        System.out.println("Static Block"); //cannot get executed more than once,doesn't depend on object
    }

    public static void main(String[] args) {
        //execution flow is the main difference
        System.out.println("main Method");

new StaticBlockVsInstanceBlockVsConstructor();
new StaticBlockVsInstanceBlockVsConstructor();
    }
}
