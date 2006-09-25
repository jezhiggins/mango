package uk.co.jezuk.mango.algorithms;

/**
 * @version $Id$
 */
public class RemoveIf
{
  static public void execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
	{
    if((iterator == null) || (test == null))
      return;  

    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(test.test(obj))
				iterator.remove();
    } // while ...
  } // execute

  private RemoveIf() { }
} // RemoveIf
