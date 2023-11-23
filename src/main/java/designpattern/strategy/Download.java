package designpattern.strategy;

public class Download implements ETLHandler{


   @Override
   public void process() {
      System.out.println("Processing data for Download!!!");
   }

   @Override
   public void dump() {
      System.out.println("Dumping data to a file for Download!!!");
   }
}
