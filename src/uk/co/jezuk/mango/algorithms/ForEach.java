package uk.co.jezuk.mango.algorithms;

/**
 * The algorithm ForEach applies the function <code>fn</code> to
 * each element in the <code>iterator</code> sequence. 
 * @version $Id$
 */
public class ForEach
{
    static public void execute(java.util.Iterator iterator, uk.co.jezuk.mango.UnaryFunction fn)
    {
	if(iterator == null || fn == null)
	    return;

	while(iterator.hasNext())
	    fn.fn(iterator.next());
    } // execute

    //////////////////////////////////
    private ForEach() { }
} // ForEach
