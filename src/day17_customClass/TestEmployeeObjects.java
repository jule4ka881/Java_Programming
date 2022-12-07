package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumeye",28,'F',"Java Developer",95000,"A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar",29,'M',"Back-end Developer",140000,"B69");

        Employee employee3 = new Employee();
        employee3.setInfo("Yulia",34,'F',"SDET",100000,"G28");
//3 objects are created in the java heap memory^ employee1,2,3
        employee2.age = 39; //if we need to change the age for employee2


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work(); //Sumeye will be working

    }
}
