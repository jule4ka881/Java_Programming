package day25_Constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

Employee e1 = new Employee("Rashid",32, 'M',"SDET",100000, LocalDate.of(2020,12,2));

Employee e2 = new Employee("Kim",31,'M',"Project Manager",95000,LocalDate.of(2000,12,28));

        System.out.println(e2);
        System.out.println(e1);

    }
}
//we want to create 3 employee objects