package uk.co.jezuk.mango.algorithms;

import uk.co.jezuk.mango.iterators.PredicatedIterator;
import java.util.Iterator;
/**
 * <code>CountIf</code> is similar to <code>Count</code>, but more general.
 * It computes the number of elements in the sequence which satisfy some condition.  
 * The condition is a described in the user-supplied <code>test</code> object, and 
 * <code>CountIf</code> computes the number of objects such that <code>test.test(o)</code>
 * is <code>true</code>.
 * @see Count
 * @version $Id$
 */
public class CountIf
{
  static public int execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
  {
    if((iterator == null) || (test == null))
      return 0;  

    int c = 0;
    for(Iterator filter = new PredicatedIterator(iterator, test); 
	filter.hasNext();
	filter.next(), ++c);

    return c;
  } // execute

  /////////////////////////////////////////////////////////
  private CountIf() { }
} // CountIf
