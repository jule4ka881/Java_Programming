package day28_Encapsulation.encapsulation;

import java.sql.SQLOutput;

public class TestEmployeeObject {


    public static void main(String[] args) {
        /*
        Employee employee1 = new Employee("josh",100000);
        //employee1.salary = -200000;
        System.out.println(employee1);
        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());

        employee1.setName("    ");
        System.out.println(employee1.getName());
        */


        Employee employee1 = new Employee("Olga",30,"SDET",100000);
        System.out.println(employee1);
    }
}
