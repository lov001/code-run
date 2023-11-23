package test.javabasic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParseBug {


   public static void main(String[] args) {
      LocalDateTime dateTime = LocalDateTime.parse("2021-04-28T22:32:00.000");
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
      String formattedDateTime = dateTime.format(formatter);
      System.out.println(formattedDateTime);
   }
}