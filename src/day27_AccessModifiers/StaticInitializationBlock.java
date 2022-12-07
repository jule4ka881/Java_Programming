package day27_AccessModifiers;

public class StaticInitializationBlock {
    public static int a;
    public static double b;
    public static String c;

    //same value will be shared for all objects

    //public static ExcelSheet sheet;
    static{
        a=100;
        b=20.5;
        c="Java";
    }
}
