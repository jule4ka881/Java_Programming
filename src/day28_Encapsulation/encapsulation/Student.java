package day28_Encapsulation.encapsulation;

public class Student {

    private String name;

    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;

            }
            if (!hasDigit) {
                System.err.println("Invalid name" + name);
                System.exit(1);
            }

        }
        this.name = name;
    }

    public int getAge(){  //to read the data
    if(age==0){  //if age is not set
        System.err.println("The age has not been set");
        System.exit(1);
    }
    return age;
}

public void setAge(int age){   //to write the data




    if(age<1 || age > 100){
        System.err.println("Invalid age "+age);
        //return will just exit the method,we need to exit the system
        System.exit(1); //entire program gets terminated
    }

    this.age = age;
}

}
