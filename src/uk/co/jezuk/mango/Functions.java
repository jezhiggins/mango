package uk.co.jezuk.mango;

import uk.co.jezuk.mango.functions.*;

/**
 * The Mango Library Unary Functions
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
  static public <T> Function<T, T> Identity() 
  { 
    return (Function<T, T>)Identity.INSTANCE; 
  } // Identity
} // class Functions
