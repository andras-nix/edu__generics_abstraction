package com.nixsolutions.ppp.generics;

public class SimpleTuplePrinter implements CollectionPrinter<Tuple<?>> {

  @Override
  public void print(Tuple<?> collection) {
    System.out.printf("%s%n%s%n", collection.getFirst(), collection.getSecond());
  }
}
