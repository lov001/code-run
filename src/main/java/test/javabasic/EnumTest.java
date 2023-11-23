package test.javabasic;

public class EnumTest {


   public enum Event {
      CREATED("created"), UPDATED("updated"), DELETED("deleted");

      private String name;

      Event(String name) {
         this.name = name;
      }

      public String getName() {
         return this.name;
      }
   }

   public static void main(String[] args) {
      System.out.println(Event.CREATED);
      System.out.println(Event.DELETED.getName());
   }

}
