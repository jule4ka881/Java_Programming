package day28_Encapsulation;

public class Person1 {
    private String name;
    private int age; //the only way we can access this instance vars from other class is:
                     //to create a method here, so we will be able to read and write
    public String getName(){
        if(name==null){
            System.err.println(name+" Cannot be null");
        }
        return name; //if there r no conditions
    }
    public void setName(String name){  //no return type, cause we need only to be able to write
    if(name.isEmpty()){
        System.err.println("Name acn not be empty");
        System.exit(1);
    }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age cannot be negative: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
