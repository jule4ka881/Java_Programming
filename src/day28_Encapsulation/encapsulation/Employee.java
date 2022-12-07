package day28_Encapsulation.encapsulation;

public class Employee {

    private String name;

    private int age;


    public String jobTitle;

    private double salary;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid job title");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public Employee(String name,int age,String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        if(name == null){
          return "Unknown";

        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Cannot be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() { //READ
        return salary;
    }

    public void setSalary(double salary) { //WRITE
        if(salary < 0){
            System.err.println("Salary cannot be negative" + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
