package designpattern.strategy;

import java.util.function.Supplier;

public enum ETLStep {
   DOWNLOAD(Download::new),
   SEARCH(Search::new),
   QE_CRAWL(QueryEngineCrawler::new);

   private final Supplier<ETLHandler> handlerSupplier;

   ETLStep(Supplier<ETLHandler> handlerSupplier) {
      this.handlerSupplier = handlerSupplier;
   }

   public ETLHandler getHandlerSupplier() {
      return handlerSupplier.get();
   }
}
