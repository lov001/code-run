package designpattern;

import designpattern.strategy.ETLHandler;
import designpattern.strategy.ETLStep;

public class StrategyApplication {


   public static void main(String[] args) {
      String applicationType = "SEARCH";
      ETLStep step = ETLStep.valueOf(applicationType);
      ETLHandler application = step.getHandlerSupplier();
      application.crawl();
      application.process();
      application.dump();
   }

}
