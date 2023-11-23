package designpattern.strategy;

public interface ETLHandler {

   default void crawl(){
      System.out.println("Crawling Data........");
   }

   void process();
   void dump();
}
