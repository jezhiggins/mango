package uk.co.jezuk.mango.binarypredicates;

/**
 * <code>BinaryPredicate</code> that returns true if <code>x</code> is greater than or equal to <code>y</code>.
 * <code>x</code> and <code>y</code> must implement the <code>java.lang.Comparable<code> interface.
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class GreaterThanEquals implements uk.co.jezuk.mango.BinaryPredicate
{
  /**
   * @return <code>true</code> if <code>x.compareTo(y) &gt; 0</code> 
   */
  public boolean test(Object x, Object y)
  {
    if((x == null) && (y == null))
      return true;
    if(x == null)
      return false;
    if(y == null)
      return true;

    return ((Comparable)x).compareTo(y) >= 0;
  } // test
} // GreaterThanEquals

