package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(),new Person(),new Person() };

        people[0].setInfo("Dan",'M', LocalDate.of(2012,12,11));
        people[1].setInfo("Kay",'F',LocalDate.of(1988,9,8));
        people[2].setInfo("May",'F',LocalDate.of(1998,7,10));
        people[3].setInfo("Fay",'F',LocalDate.of(1983,11,25));
        people[4].setInfo("Yulia",'F',LocalDate.of(1988,12,28));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));






//print name and DOB

//remove Person objects older than 55 using removeIf()

    }
}
