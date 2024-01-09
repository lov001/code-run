package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import reactor.core.publisher.Mono;

public class Test {


   public static void main(String[] args) {
     String sqlQuery = "SELECT EMP_PK, name FROM ${{employee}} a1 join ${{department}} a2 on a1.id = a2.id";
     extractTableNamesFromSqlQuery(sqlQuery);
      Mono.just("Brian")
          .map(String::toUpperCase)
          .map(name -> "Hi..!! " + name + ", How are you?")
          .subscribe(System.out::println);
   }

   private static void extractTableNamesFromSqlQuery(String sqlQuery){
      List<String> tableNames = new ArrayList<>();
      Pattern pattern = Pattern.compile("\\$\\{\\{(.*?)}}");
      Matcher matcher = pattern.matcher(sqlQuery);
      while (matcher.find()) {
         String tableName = matcher.group(1);
         tableNames.add(tableName);
         System.out.println("Table Name: " + tableName);
      }
   }
}
