package uk.co.jezuk.mango;

/**
 * <code>CountIf</code> is similar to <code>Count</code>, but more general.
 * It computes the number of elements in the sequence which satisfy some condition.  
 * The condition is a described in the user-supplied <code>test</code> object, and 
 * <code>CountIf</code> computes the number of objects such that <code>test.test(o)</code>
 * is <code>true</code>.
 * @see Count
 * @version $Id$
 */
class CountIf
{
  static int execute(java.util.Iterator iterator, Predicate test)
  {
    if((iterator == null) || (test == null))
      return 0;  

    int c = 0;
    while(iterator.hasNext())
      if(test.test(iterator.next()))
	++c;

    return c;
  } // execute

  /////////////////////////////////////////////////////////
  private CountIf() { }
} // CountIf
