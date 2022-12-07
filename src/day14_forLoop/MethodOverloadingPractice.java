package day14_forLoop;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

        System.out.println(sum(1.5,2.5));
        System.out.println(sum(1.5,8.9));
        System.out.println(sum(4.6,8.9,7.6,9.0));
        System.out.println(sum(10,20.5)); //the method with double gets executed
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3){
return sum(num1,num2)+num3;
    }
    public static int sum(int num1, int num2,int num3,int num4){
        return sum(num1,num2,num3)+num4;
    }
    public static double sum(double n1,double n2){
        return n1+n2;
    }
public static double sum(double n1, double n2,double n3){
        return sum(n1,n2)+n3;
}
public static double sum(double n1,double n2,double n3,double n4){
        return sum(n1,n2,n3)+n4;
}
}
