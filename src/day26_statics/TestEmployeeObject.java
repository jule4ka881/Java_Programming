package day26_statics;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rashid");
        System.out.println(e1);
        Employee e2 = new Employee("Oliver",'M');
        System.out.println(e2);
        Employee e3 = new Employee("Olga",'F',"SDET");
        System.out.println(e3);
        Employee e4 = new Employee("Yulia",'F',"Analyst",120000);
        System.out.println(e4);
    }
}
