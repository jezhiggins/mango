package uk.co.jezuk.mango;

/**
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
    } // do

    //////////////////////////////////
    private ForEach() { }
} // ForEach
