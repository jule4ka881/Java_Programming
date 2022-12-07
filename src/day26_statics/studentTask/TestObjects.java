package day26_statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Yusuf",21,'M',"A16");
        Student student2 = new Student("Isra",25,'F',"B34");
        Student student3 = new Student("Yusuf",28,'M',"A45");
        Student student4 = new Student("Olga",26,'F',"G6");
        Student student5= new Student("Yusuf",27,'M',"I28");
//5 student objects are created by using the same constructor



        Student[] students = {student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("Java Turtles",1);
        group1.addStudent(student1);
        group1.addStudent(students);
        group1.addStudent("Khashayar",34,'M',"F35"); //added 6th student

        System.out.println(group1);

        group1.removeStudent("G6");
        group1.removeStudent("I28");
        System.out.println(group1);

        //we will iterate the arrayList so we can print out all of the students

        for(Student each : group1.students){
            System.out.println(each.name + " : " + each.id);
        }
        System.out.println("------------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles",1);
        StudentsGroup group3 = new StudentsGroup("Java Turtles",1);
        StudentsGroup group4 = new StudentsGroup("Java Turtles",1);
        StudentsGroup[] groups = {group1,group2,group3,group4};
        
    }
}
/*
 Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */