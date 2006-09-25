package uk.co.jezuk.mango.algorithms;

/**
 * @version $Id: Partition.java 60 2002-06-12 13:47:08Z jez $
 */
public class Partition
{
  static public java.util.Collection execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test, java.util.Collection results)
  {
    if((iterator == null) || (test == null))
      return results;  

    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(test.test(obj))
			{
				iterator.remove();
				if(results != null)
					results.add(obj);
			} // if ...
    } // while ...
		
		return results;
  } // execute

  private Partition() { }
} // Partition
