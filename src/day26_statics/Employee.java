package day26_statics;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;
    //all of the variables are instances, with their own memory


    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
