package uk.co.jezuk.mango.algorithms;

import uk.co.jezuk.mango.iterators.PredicatedIterator;
import java.util.Iterator;
import uk.co.jezuk.mango.unarypredicates.Not;

/**
 * <code>CountIfNot</code> is the complement of <code>CountIf</code>.
 * It counts the number of elements in the sequence which fail some condition.  
 * The condition is a described in the user-supplied <code>test</code> object, and 
 * <code>CountIfNot</code> computes the number of objects such that <code>test.test(o)</code>
 * is <code>false</code>.
 * @see Count
 * @see CountIf
 * @version $Id$
 */
public class CountIfNot
{
  static public int execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
  {
    if((iterator == null) || (test == null))
      return 0;  

    int c = 0;
    for(Iterator filter = new PredicatedIterator(iterator, new Not(test)); 
	filter.hasNext();
	filter.next(), ++c);

    return c;
  } // execute

  /////////////////////////////////////////////////////////
  private CountIfNot() { }
} // CountNotIf
