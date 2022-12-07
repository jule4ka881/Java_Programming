package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //------------------Implicit Casting------------------
        byte a =15;
        short b = a;
        // short b = (short)a; - on the background
        System.out.println(b);

        int c = a; //implicit

        long d = 3000; // 3000 is int is assigned to long
        //long d = 3000L; //assign to long

        float l = d; //implicit

        //-----------------Explicit---------------------

        int x = 100;
        byte y = (byte)x;

        float z = 20.8f; // no casting cause float assigned to float
        short q = (short)z; // z = 20.8, will get only 20

        System.out.println(q);
         double n1 = 2.5;
         byte n2 = (byte) n1; // cast to byte
        System.out.println(n2); // will print 2 only (int)

        System.out.println("----------------------------");

        int num = 500;
        byte result = (byte) num; // explicit casting
        System.out.println(result); // will print negative number


        int r = 50000; //value is shorter
        short t = (short) r;
        System.out.println(t); // will be negative number

        double u = 3000.5;
        int p = (int)u; //explicit casting
        System.out.println(p);

        int o = 100;
        double d1 = o;
        System.out.println(d1);// implicit will convert to decimal
    }
}
