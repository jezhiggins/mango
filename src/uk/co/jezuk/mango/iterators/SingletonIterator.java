package uk.co.jezuk.mango.iterators;

/**
 * Iterators over a single object 
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class SingletonIterator implements java.util.Iterator
{
  public SingletonIterator(Object object)
  {
    object_ = object;
  } // SingletonIterator

  public boolean hasNext()
  {
    return (object_ != null);
  } // hasNext

  public Object next()
  {
    Object o = object_;
    object_ = null;
    return o;
  } // next

  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.SingletonIterator does not support the remove method");
  } // remove

  //////////////////////
  private Object object_;
} // SingletonIterator
