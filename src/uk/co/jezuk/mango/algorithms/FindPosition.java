package uk.co.jezuk.mango.algorithms;

/**
 * Searchs the sequence travesed by the Iterator for the given value.
 * Returns the index of the value in the collection, or <code>-1</code>
 * if the value is not found.  The iterator will have been advanced to 
 * the next object in the sequence.
 * The objects in the sequence and <code>value</code> must be comparable using
 * <code>Object.equals</code>.
 * @see Find
 * @version $Id: Find.java 93 2004-05-25 20:34:19Z jez $
 */
public class FindPosition
{
  static public int execute(java.util.Iterator iterator, Object value)
  {
    if(iterator == null)
      return -1;

		int count = 0;
    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(value.equals(obj))
				return count;
			++count;
    } // while ...

		return -1;
  } // execute

  private FindPosition() { }
} // Find
