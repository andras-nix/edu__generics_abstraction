package com.nixsolutions.ppp.generics;

public class Tuple<E> {

  private final Object[] elements = new Object[2];

  public Tuple(E a, E b) {
    elements[0] = a;
    elements[1] = b;
  }

  public E getFirst() {
    return get(0);
  }

  @SuppressWarnings("unchecked")
  private E get(int index) {
    return (E) elements[index];
  }

  public E getSecond() {
    return get(1);
  }
}
