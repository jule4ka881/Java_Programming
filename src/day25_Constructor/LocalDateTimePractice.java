package day25_Constructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {
    public static void main(String[] args) {


        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);
        DateTimeFormatter df =DateTimeFormatter.ofPattern("EEE,  hh:mm a,  MMM/d/y");
        System.out.println(starts.format(df));
    }
}
/*
 DateTimeFormatter df =DateTimeFormatter.ofPattern("MMM/dd/y EEEE");
        System.out.println(today.format(df));
 */