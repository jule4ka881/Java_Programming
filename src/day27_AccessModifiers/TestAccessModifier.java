package day27_AccessModifiers;

public class TestAccessModifier {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicDate);
        System.out.println(AccessModifiers.protectedData);
        System.out.println(AccessModifiers.defaultDate); //default AM is accessible within same package
        //System.out.println(AccessModifiers.privateData); ---> not accessible i same package even

    }


}
