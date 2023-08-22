package com.nixsolutions.ppp.generics;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    var listA = List.of(1, 2, 3);
    var listB = List.of("A", "B", "C");

    var listPrinter = new ListPrinter();
    listPrinter.print(listA);
    listPrinter.print(listB);

    var tupleA = new Tuple<>(1, 2);
    var tupleB = new Tuple<>("A", "B");

    var tuplePrinter = new TuplePrinter();
    tuplePrinter.print(tupleA);
    tuplePrinter.print(tupleB);
  }
}
