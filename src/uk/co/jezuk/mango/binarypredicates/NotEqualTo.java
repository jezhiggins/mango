package uk.co.jezuk.mango.binarypredicates;

/**
 * <code>BinaryPredicate</code> testing for inequality
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class NotEqualTo implements uk.co.jezuk.mango.BinaryPredicate
{
  /**
   * @return <code>true</code> if <code>!(x.equals(y))</code>, <code>(x == null && y != null)</code> or <code>(x != null && y == null)</code>
   */
  public boolean test(Object x, Object y)
  {
    if(x == null && y == null)
      return false;
    if(x == null || y == null)
      return true;

    return !(x.equals(y));
  } // test
} // NotEqualTo
