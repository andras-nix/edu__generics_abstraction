package com.nixsolutions.ppp.generics;

import java.util.List;

public class SimpleListPrinter implements CollectionPrinter<List<?>> {

  @Override
  public void print(List<?> collection) {
    collection.forEach(System.out::println);
  }
}
