package uk.co.jezuk.mango;

/**
 * The algorithm ForEach applies the function <code>fn</code> to
 * each element in the <code>iterator</code> sequence. 
 * @version $Id$
 */
class ForEach
{
    static void execute(java.util.Iterator iterator, UnaryFunction fn)
    {
	if(iterator == null || fn == null)
	    return;

	while(iterator.hasNext())
	    fn.fn(iterator.next());
    } // execute

    //////////////////////////////////
    private ForEach() { }
} // ForEach
