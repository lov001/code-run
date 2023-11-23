package designpattern.strategy;

public class QueryEngineCrawler implements ETLHandler{


   @Override
   public void process() {
      System.out.println("Processing data for Query Engine Crawler!!!");
   }

   @Override
   public void dump() {
      System.out.println("Dumping data to a Mongo Database!!!");
   }
}
