package uk.co.jezuk.mango.algorithms;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Intersection
{
	static public Collection execute(Iterator iter, Collection coll, Collection results)
	{
		while(iter.hasNext())
		{
			Object o = iter.next();
			if(coll.contains(o))
				results.add(o);
		} // while
		return results;
	} // execute

	static public Collection execute(Iterator iter, Iterator iter2, Collection results)
	{
		Collection coll = new ArrayList();
		while(iter2.hasNext())
			coll.add(iter2.next());
		return execute(iter, coll, results);
	} // execute
	
	private Intersection() { }
} // class Intersection
