package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        System.out.println(today);
//declaring a variable for birthday(if we need to store someone's birthday
        LocalDate birthday = LocalDate.of(1988,12,28);
        System.out.println(birthday);

        System.out.println("---------------------------------------------------");

        System.out.println( today.getYear() );
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(birthday.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfMonth());

        System.out.println("----------------------------------------------");

        today= today.plusYears(1); //adding 1 year to today's year new object created
        System.out.println(today);          //that's why we assigned it to a new today

        System.out.println("--------------------------------------------------------");
        LocalDate gradDate = LocalDate.of(2025,6,4);

        gradDate = gradDate.plusYears(2); // assigning so it will show the delayed year 2027, not 2025
        System.out.println(gradDate);
        gradDate = gradDate.plusMonths(7);
        System.out.println(gradDate);
        gradDate = gradDate.plusWeeks(7);
        System.out.println(gradDate);
        gradDate = gradDate.plusDays(100);
        System.out.println(gradDate);

        System.out.println("--------------------------------------");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);
        LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths (3).minusDays(2);
        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthday);

        System.out.println("--------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        birthday1.isEqual(birthday2);
        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1);

        System.out.println("--------------------------------------");

        LocalDate grD = LocalDate.of(2023,1,1);

        System.out.println(grD.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(grD.isAfter(LocalDate.of(2022,12,31)));

        System.out.println("--------------------------------------");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());









    }
}
