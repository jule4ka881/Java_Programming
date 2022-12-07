package day25_Constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);//today's date and time

        LocalDateTime ends = LocalDateTime.of(2023, 5,18,11,0);

        System.out.println(ends);
        System.out.println(starts.getDayOfWeek());
        System.out.println(starts.getHour());
    }
}
