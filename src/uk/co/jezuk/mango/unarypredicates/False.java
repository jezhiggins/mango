package uk.co.jezuk.mango.unarypredicates;

import uk.co.jezuk.mango.Predicate;

public class False<T> implements Predicate<T>
{
  public boolean test(T x) { return false; }
} // False
