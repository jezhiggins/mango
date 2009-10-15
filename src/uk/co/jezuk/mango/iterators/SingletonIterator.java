package uk.co.jezuk.mango.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterators over a single object 
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class SingletonIterator<T> implements Iterator<T>
{
  public SingletonIterator(T object)
  {
    object_ = object;
  } // SingletonIterator

  public boolean hasNext()
  {
    return (object_ != null);
  } // hasNext

  public T next()
  {
    if(object_ == null)
      throw new java.util.NoSuchElementException();
    T o = object_;
    object_ = null;
    return o;
  } // next

  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.SingletonIterator does not support the remove method");
  } // remove

  //////////////////////
  private T object_;
} // SingletonIterator
