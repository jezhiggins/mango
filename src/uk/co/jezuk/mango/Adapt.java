package uk.co.jezuk.mango;

import java.lang.reflect.Method;

/**
 * Object method adaptors.
 * @see Bind
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class Adapt
{
  /**
   * Adapts member functions as <code>Function</code> objects, allowing them
   * to be passed to algorithms.
   * <br>
   * e.g. to print all the elements in a list<br>
   * <code>Mango.forEach(list, Adapt.Method(System.out, "println"));</code><br>
   * is equivalent to <br>
   * <code>for(int i = 0; i < list.size(); ++i)</code><br>
   * <code>  System.out.println(list.get(i));</code>
   * <p>
   * If the named method is not found, or its signature is incorrect throws a
   * RuntimeException.  If multiple methods have the correct name, and take a single
   * parameter one of them will be called, but you can't determine which.
   */
  static public Function Method(final Object obj, String methodName)
  {
    return wrapMethod(obj.getClass(), obj, methodName);
  } // Method 

  /**
   * Adapts static member functions as <code>Function</code> objects, allowing them
   * to be passed to algorithms.
   * <p>
   * If the named method is not found, or its signature is incorrect throws a
   * RuntimeException.  If multiple methods have the correct name, and take a single
   * parameter one of them will be called, but you can't determine which.
   */
  static public Function Method(final Class klass, String methodName)
  {
    return wrapMethod(klass, null, methodName);
  } // Method

  static private class UnaryMethodNamed implements Predicate
  {
      UnaryMethodNamed(String name, int argCount) 
      { 
	name_ = name; 
	argCount_ = argCount;
      } // UnaryMethodNamed
      public boolean test(Object obj)
      {
        java.lang.reflect.Method m = (java.lang.reflect.Method)obj;
	return (m.getName().equals(name_) && (m.getParameterTypes().length == argCount_));
      } // test
      private String name_;
      private int argCount_;
  } // UnaryMethodNamed

  static private Function wrapMethod(final Class klass, final Object obj, String methodName)
  {
    Method[] methods = klass.getMethods();
    final Method m = (Method)Algorithms.findIf(java.util.Arrays.asList(methods).iterator(), new UnaryMethodNamed(methodName, 1));
    if(m == null)
      throw new RuntimeException(new NoSuchMethodException());

    return new Function() {
      private Object obj_;
      private Method method_;
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
    }; // Function
  } // wrapMethod

  /**
   * Creates a <code>Function</code> which will call a method on the
   * object passed as the argument to <code>Function.fn</code> method.
   * <br>
   * e.g. to print all the elements in a list<br>
   * <code>interface Something { void persist(); }<br>
   * // fill list with Somethings
   * Mango.forEach(list, Bind.ArgumentMethod("persist"));</code><br>
   * is equivalent to <br>
   * <code>for(int i = 0; i < list.size(); ++i)<br>
   * {<br>
   * &nbsp;&nbsp;Something s = (Something)list.get(i);<br>
   * &nbsp;&nbsp;s.persist();<br>
   * }</code>
   * <p>
   * If the named method is not found, or its signature is incorrect throws a
   * RuntimeException.  
   * @see Function
   */
  static public Function ArgumentMethod(final String methodName)
  {
    return new Function() {
      private String methodName_;
      private Class lastClass_;
      private Method method_;
      { methodName_ = methodName; }
      public Object fn(Object arg) 
      { 
	if(!arg.getClass().equals(lastClass_))
	{
	  lastClass_ = arg.getClass();
	  Method[] methods = lastClass_.getMethods();
	  method_ = (Method)Algorithms.findIf(java.util.Arrays.asList(methods).iterator(), new UnaryMethodNamed(methodName, 0));
	  if(method_ == null)
	    throw new RuntimeException(new NoSuchMethodException());
	} // if ...
	  
	try {
	  return method_.invoke(arg, (Object[])(null));
	} // try
	catch(Exception e) {
	  throw new RuntimeException(e);
	} // catch
      } // fn
    }; // Function
  } // ArgumentMethod

  //////////////////////////////////////////
  private Adapt() { }
} // Adapt
