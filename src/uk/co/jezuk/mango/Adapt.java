package uk.co.jezuk.mango;

/**
 * Object method adaptors.
 * @see Bind
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Adapt
{
  /**
   * Adapts member functions as <code>UnaryFunction</code> objects, allowing them
   * to be passed to algorithms.
   * <br>
   * e.g. to print all the elements in a list<br>
   * <code>Mango.forEach(list, Bind.Method(System.out, "println"));</code><br>
   * is equivalent to <br>
   * <code>for(int i = 0; i < list.size(); ++i)</code><br>
   * <code>  System.out.println(list.get(i));</code>
   * <p>
   * If the named method is not found, or its signature is incorrect throws a
   * RuntimeException.  If multiple methods have the correct name, and take a single
   * parameter one of them will be called, but you can't determine which.
   */
  static public UnaryFunction Method(final Object obj, String methodName)
  {
    return wrapMethod(obj.getClass(), obj, methodName);
  } // Method 

  static public UnaryFunction Method(final Class klass, String methodName)
  {
    return wrapMethod(klass, null, methodName);
  } // Method

  static private UnaryFunction wrapMethod(final Class klass, final Object obj, String methodName)
  {
    java.lang.reflect.Method[] methods = klass.getMethods();
    for(int i = 0; i < methods.length; ++i)
    {
      final java.lang.reflect.Method m = methods[i];
      if(m.getName().equals(methodName) && (m.getParameterTypes().length == 1))
	return new UnaryFunction() {
	    private Object obj_;
	    private java.lang.reflect.Method method_;
	    { obj_ = obj; method_ = m; }
	    public Object fn(Object arg) 
	    { 
	      Object[] args = new Object[]{ arg };
	      try {
		return method_.invoke(obj_, args);
	      } // try
	      catch(Exception e) {
		throw new RuntimeException(e);
	      } // catch
	    } // fn
	  }; // UnaryFunction
    } // for 

    throw new RuntimeException(new NoSuchMethodException());
  } // wrapMethod

  static public UnaryFunction ElementMethod(String methodName)
  {
    return null;
  } // ElementMethod

  //////////////////////////////////////////
  private Adapt() { }
} // Adapt

