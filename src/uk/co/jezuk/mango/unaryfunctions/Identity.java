package uk.co.jezuk.mango.unaryfunctions;

import uk.co.jezuk.mango.UnaryFunction;

public enum Identity implements UnaryFunction<Object, Object>
{
  INSTANCE;

  public Object fn(final Object o) { return o; }
} // Identity
