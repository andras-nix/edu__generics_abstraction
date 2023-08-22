package com.nixsolutions.ppp.generics;

import java.util.Iterator;

public abstract class CollectionPrinterTemplate<T> implements CollectionPrinter<T> {

  @Override
  public void print(T collection) {
    createIterator(collection).forEachRemaining(System.out::println);
  }

  abstract Iterator<Object> createIterator(T collection);
}
