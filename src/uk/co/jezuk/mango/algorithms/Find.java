package uk.co.jezuk.mango;

/**
 * Searchs the sequence travesed by the Iterator for the given value.
 * Returns the <code>Object</code>, or <code>null</code> if the value
 * is not found.  The iterator will have been advanced to the next object 
 * in the sequence.
 * The objects in the sequence and <code>value</code> must be comparable using
 * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
 * @see FindIf
 * @version $Id$
 */
class Find
{
  static Object execute(java.util.Iterator iterator, Object value)
  {
    if((iterator == null) || (value == null))
      return null;  

    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(value.equals(obj))
	return obj;
    } // while ...

    return null;
  } // execute

  private Find() { }
} // Find
