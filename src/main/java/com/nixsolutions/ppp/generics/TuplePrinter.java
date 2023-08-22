package com.nixsolutions.ppp.generics;

import java.util.Iterator;
import java.util.List;

public class TuplePrinter extends CollectionPrinterTemplate<Tuple<?>> {

  @Override
  Iterator<Object> createIterator(Tuple<?> collection) {
    return List.of(collection.getFirst(), collection.getSecond()).iterator();
  }
}
