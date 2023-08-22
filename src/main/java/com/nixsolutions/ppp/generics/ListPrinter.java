package com.nixsolutions.ppp.generics;

import java.util.Iterator;
import java.util.List;

public class ListPrinter extends CollectionPrinterTemplate<List<?>> {

  @Override
  Iterator<Object> createIterator(List<?> collection) {
    return collection.stream().map(e -> (Object) e).iterator();
  }
}
