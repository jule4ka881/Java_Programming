package day28_Encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        //student1.age = -200; we can't access it if its private
        student.setAge(25);
        System.out.println(student.getAge());
        System.out.println("Test completed");


        student.setName("Rashid123"); // will check conditions
        System.out.println(student.getName());
    }
}
//if we pass negative -25 the program will be terminated
//or 101
//without setting student.setAge(25); will print us 0