package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {



        LocalDate today =LocalDate.now();
        System.out.println(today);
        //we will format it: using DateTime formatter class
        DateTimeFormatter df =DateTimeFormatter.ofPattern("MMM/dd/y EEEE");
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df)); //July-01-22

 DateTimeFormatter tf=DateTimeFormatter.ofPattern("HH:mm a");
LocalTime time1 = LocalTime.of(7,5);


        System.out.println(time1.format(tf));//07:05

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MM/dd/y  hh:mm a ");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));
    }
}
