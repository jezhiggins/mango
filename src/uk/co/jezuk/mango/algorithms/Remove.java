package uk.co.jezuk.mango.algorithms;

/**
 * @version $Id$
 */
public class Remove
{
  static public void execute(java.util.Iterator iterator, Object value)
  {
    if(iterator == null)
      return;  

    while(iterator.hasNext())
    {
      Object obj = iterator.next();
      if((value == null && obj == null) || value.equals(obj))
	iterator.remove();
    } // while ...
  } // execute

  private Remove() { }
} // Remove
