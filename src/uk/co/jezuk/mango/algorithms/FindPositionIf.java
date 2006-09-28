package uk.co.jezuk.mango.algorithms;

public class FindPositionIf
{
  static public int execute(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate test)
  {
		if(iterator == null)
      return -1;

		int count = 0;
    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if(test.test(obj))
				return count;
			++count;
    } // while ...
		
		return -1;
  } // execute

  private FindPositionIf() { }
} // Find
