package uk.co.jezuk.mango;

/**
 * <code>Count</code> computes the number of elements in the sequence that 
 * are equal to <code>value</code>.  <br>
 * <code>value</code> may be <code>null</code>.<br>
 * The objects in the sequence and <code>value</code> must be comparable using
 * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
 * @version $Id$
 */
class Count
{
  static int execute(java.util.Iterator iterator, Object value)
  {
    if(iterator == null)
      return 0;  

    if(value == null)
      return execute_null(iterator);

    int c = 0;
    while(iterator.hasNext())
      if(value.equals(iterator.next()))
	++c;

    return c;
  } // execute

  static private int execute_null(java.util.Iterator iterator)
  {
    int c = 0;
      
    while(iterator.hasNext())
      if(iterator.next() == null)
	++c;
    return c;
  } // executer_null

  private Count() { }
} // Count
