package day27_AccessModifiers;

public class TestCydeoStudent {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);
CydeoStudent student1 = new CydeoStudent("Ekaterina",32,'F');
CydeoStudent student2 = new CydeoStudent("Alena,28",28,'F');

        System.out.println(student1);
        System.out.println(student2);
 //not the legal name to call statics
        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.secretCode);

        System.out.println(CydeoStudent.secretCode);
        System.out.println(CydeoStudent.schoolName);

    }
}
