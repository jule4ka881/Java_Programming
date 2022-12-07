package utilities;
import day27_AccessModifiers.AccessModifiers;
import day27_AccessModifiers.Data;
//without this import statement we won't be able to call all of those vars and methods
public class Test {

    public static void main(String[] args) {

       //calling variables:


        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        //calling methods:
        Data.method3();
        Data.method4();

        //in order to call instances we need to create an object
        Data obj = new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("---------------------------------------");

        System.out.println(AccessModifiers.publicDate);
        //System.out.println(AccessModifiers.protectedData); --> NOT ALWAYS accessible
        //System.out.println(AccessModifiers.defaultDate); ---> Default AM is not accessible in other packages
        //System.out.println(AccessModifiers.privateData); --> not accessible in different packages

   new AccessModifiers(); //can create object in any other package
    }
}
