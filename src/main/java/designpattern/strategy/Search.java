package designpattern.strategy;

public class Search implements ETLHandler{


   @Override
   public void process() {
      System.out.println("Processing data for Search!!!");
   }

   @Override
   public void dump() {
      System.out.println("Dumping data to Elastic for Search!!!");
   }
}
