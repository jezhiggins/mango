package uk.co.jezuk.mango.algorithms;

import uk.co.jezuk.mango.iterators.SelectingIterator;
import java.util.Iterator;


/**
 * Searchs the sequence traversed by the Iterator and returns the first
 * object encountered for which the Predicate returns <code>true</code>.
 * Returns the <code>Object</code>, or <code>null</code> if the value
 * is not found.  The iterator will have been advanced to the next object 
 * in the sequence.
 * @see Find
 * @see FindNotIf
 * @version $Id$
 */
public class FindIf
{
  static public Object execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
  {
    if((iterator == null) || (test == null))
      return null;  

    Iterator filter = new SelectingIterator(iterator, test);
    return filter.hasNext() ? filter.next() : null;
  } // execute

  private FindIf() { }
} // FindIf






