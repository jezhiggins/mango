package uk.co.jezuk.mango;

import uk.co.jezuk.mango.unaryfunctions.*;

/**
 * The Mango Library Unary and Binary Functions
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class Functions
{
	////////////////////////////////////////////////////
	// Unary Functions
  /**
	 * The identity function.  Takes a single argument, and returns it unchanged.
	 */
	static public <T> UnaryFunction<T, T> Identity() 
  { 
    return (UnaryFunction<T, T>)Identity.INSTANCE; 
  } // Identity
} // class Functions
