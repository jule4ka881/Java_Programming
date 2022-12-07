package day26_statics;

public class ConstructorsCall2{

    public ConstructorsCall2(){
        System.out.println("Default");
    }
public ConstructorsCall2(int a){
        this(); //calling the default constructor
    System.out.println("int arg");
}

public ConstructorsCall2(String a){  //Default, int arg, string arg
    System.out.println("String arg");
}

public static void main(String[] args){

ConstructorsCall2 obj1 = new ConstructorsCall2();

    System.out.println("--------------------------------------");

    ConstructorsCall2 obj2 = new ConstructorsCall2(10);
    //when we pull second constructor, it pulls first constructor too
//so will print here first: Default and then int arg

    System.out.println("-----------------------------------------");
    ConstructorsCall2 obj3 = new ConstructorsCall2("Java");

}
}
