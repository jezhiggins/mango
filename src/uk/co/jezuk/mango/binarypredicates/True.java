package uk.co.jezuk.mango.binarypredicates;

import uk.co.jezuk.mango.BinaryPredicate;

public class True<T1, T2> implements BinaryPredicate<T1, T2>
{
  /**
   * @return <code>true</code>, always
   */
  public boolean test(T1 x, T2 y)
  {
    return true;
  } // test
} // True