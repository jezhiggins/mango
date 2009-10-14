package uk.co.jezuk.mango.binarypredicates;

import uk.co.jezuk.mango.BinaryPredicate;

public class False<T1, T2> implements BinaryPredicate<T1, T2>
{
  /**
   * @return <code>false</code>, always
   */
  public boolean test(T1 x, T2 y)
  {
    return false;
  } // test
} // False