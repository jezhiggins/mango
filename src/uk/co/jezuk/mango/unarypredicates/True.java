package uk.co.jezuk.mango.unarypredicates;

import uk.co.jezuk.mango.Predicate;

public class True<T> implements Predicate<T>
{
  public boolean test(T x) { return true; }
} // True
