package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTask1 {

    public static void main(String[] args) {
//Array list practice
        ArrayList<Employee> employees = new ArrayList<>();
        //employee object
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(),
                new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");

        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");

        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");

        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");

        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

//to get names and job titles of each employee 1.1

        for (Employee each : employees) {
            System.out.println(each.name + " : " + each.jobTitle);
        }
        System.out.println("-----------------------------------------------------------------");
        //to get names only of Java Developers
        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")) { //if teh job title equals Java developer print the name
                System.out.println(each.name); //prints the name of the employee
            }
        }
        System.out.println("---------------------------------------------------------------");
        //display maximum and minimum salary
        double max = employees.get(0).salary;
        double min = employees.get(0).salary;
        for (Employee each : employees) {
            if (each.salary > max) {
                max = each.salary;

            }
            if(each.salary < min) {
                min = each.salary;
            }
        }
        System.out.println("max = " + max);
            System.out.println("min = " + min);

        System.out.println("---------------------------------------------------------------------");
 //we need to access every element of our first employee list and females to females array, males to males
        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            //we need to determine if employee needs to be added to first or second arrayList
            if(employee.gender == 'M'){
                maleEmployees.add(employee);
            }else{
                femaleEmployees.add(employee);
            }

        }
        System.out.println("Total number of female employees: " + femaleEmployees.size());
        System.out.println("Total number of male employees: " + maleEmployees.size());
        }




    }

/*
Given arraylist of Employees:
ArrayList<Employee> employees = new ArrayList<>();
employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(),
new Employee(), new Employee()));

employees.get(0).setInfo("Josh", 34, 'M', "Java Developer, 100000, "A01");

employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");

employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");

employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");

employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

Note: Employee class is imported from day17 package

1.1 write a program that can display the name and job title of each employee
1.2 write a program that can display the names of "Java Developers"
1.3 write a program that can display the maximum and minimum salary
1.4 create two arraylists named female employees and male to femaleEmployees and maleEmployees



 */