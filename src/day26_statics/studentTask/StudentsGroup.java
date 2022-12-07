package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentsGroup HAS a Student
    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) { //creates the StudentGroup object by setting the group name and group id
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(); //size is: 0
    }
public void addStudent(Student student){ //takes 1 student object and adds it to an arrayList of students
        students.add(student);//this is one way to add a student into this arrayList by adding student object
    }

    public void addStudent(Student[] students){
this.students.addAll(Arrays.asList(students));

    }

public void addStudent(String name,int age, char gender, String id){
        //Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
}//takes name,age,gender,id of student info, creates student object by using a given info,then adds student object to the arrayList of student

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }

    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id) );// takes the id and then removes the student object with the specified id



}


}
/*
 Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)
	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body
	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList
	                removeStudent(id): removes the student with the specified id from the students arraylist
	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */