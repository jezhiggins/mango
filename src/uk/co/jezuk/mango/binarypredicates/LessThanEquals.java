package uk.co.jezuk.mango;

/**
 * <code>BinaryPredicate</code> that returns true if <code>x</code> is less than or equal to <code>y</code>.
 * <code>x</code> and <code>y</code> must implement the <code>java.lang.Comparable<code> interface.
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class LessThanEquals implements BinaryPredicate
{
  /**
   * @return <code>true</code> if <code>x.compareTo(y) &lt; 0</code> 
   */
  public boolean test(Object x, Object y)
  {
    if(x == null && y == null)
      return true;
    if(x == null)
      return true;
    if(y == null)
      return false;

    return ((Comparable)x).compareTo(y) <= 0;
  } // test
} // LessThanEquals

