package uk.co.jezuk.mango;

/**
 * The Mango Library Unary and Binary Functions
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Functions
{
	////////////////////////////////////////////////////
	// Unary Functions
  /**
	 * The identity function.  Takes a single argument, and returns it unchanged.
	 */
	static public UnaryFunction Identity() { return new uk.co.jezuk.mango.unaryfunctions.Identity(); }
} // class Functions
