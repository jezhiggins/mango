package uk.co.jezuk.mango;

/**
 * <code>BinaryPredicate</code> testing for equality
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class EqualTo implements BinaryPredicate
{
  /**
   * @return <code>true</code> if <code>x.equals(y)</code> or <code>(x == null && y == null)</code>
   */
  public boolean test(Object x, Object y)
  {
    if(x == null && y == null)
      return true;
    if(x == null || y == null)
      return false;

    return x.equals(y);
  } // test
} // EqualTo
