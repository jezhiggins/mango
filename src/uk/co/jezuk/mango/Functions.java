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
  // Function adaptors
  /**
   * Compose is a unary function adaptor.  If <code>f</code> and <code>g</code>
   * are <code>Functions</code>, then <code>Compose</code> creates a new
   * function <code>h</code>, where <code>h(x)</code> is equal to <code>f(g(x))</code>.
   */
  static public <T, T2, R> Function<T, R> Compose(final Function<T2, R> f, 
						  final Function<T, T2> g)
  {
    return new Function<T, R>() {
      public R fn(final T x)
      {
        return f.fn(g.fn(x));
      } // fn
    };
  } // Compose

    

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
