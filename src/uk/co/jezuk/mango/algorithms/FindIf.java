package uk.co.jezuk.mango.algorithms;

/**
 * Searchs the sequence traversed by the Iterator and returns the first
 * object encountered for which the Predicate returns <code>true</code>.
 * Returns the <code>Object</code>, or <code>null</code> if the value
 * is not found.  The iterator will have been advanced to the next object 
 * in the sequence.
 * @see Find
 * @version $Id$
 */
public class FindIf
{
  static public Object execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
  {
    if((iterator == null) || (test == null))
      return null;  

    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(test.test(obj))
	return obj;
    } // while ...

    return null;
  } // execute

  private FindIf() { }
} // Find






