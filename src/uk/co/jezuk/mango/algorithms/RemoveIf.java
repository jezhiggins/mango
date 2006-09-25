package uk.co.jezuk.mango.algorithms;

/**
 * @version $Id$
 */
public class RemoveIf
{
  static public void execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
	{
		execute(iterator, test, null);
	} // execute

	
  static public java.util.Collection execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test, java.util.Collection removed)
  {
    if((iterator == null) || (test == null))
      return removed;  

    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(test.test(obj))
			{
				iterator.remove();
				if(removed != null)
					removed.add(obj);
			} // if ...
    } // while ...
		
		return removed;
  } // execute

  private RemoveIf() { }
} // RemoveIf
