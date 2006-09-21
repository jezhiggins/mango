package uk.co.jezuk.mango.algorithms;

/**
 * @version $Id$
 */
public class Unique
{
	static public void execute(java.util.Iterator iterator, java.util.Comparator comparator)
	{
		if(!iterator.hasNext())
			return;

		Object prev = iterator.next();
		while(iterator.hasNext())
		{
			Object next = iterator.next();
			if(match(comparator, prev, next))
				iterator.remove();
			else
				prev = next;
		} // while
	} // execute

	static public boolean match(java.util.Comparator c, Object o1, Object o2)
	{
		if(c != null)
			return (c.compare(o1, o2) == 0);

		if((o1 == null) && (o2 == null))
			return true;

		return o1.equals(o2);
	} // compare

	private Unique() { }
} // class Unique
