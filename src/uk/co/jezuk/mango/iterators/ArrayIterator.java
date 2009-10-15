package uk.co.jezuk.mango.iterators;

import java.util.Iterator;

/**
 * Iterators over an object array, allowing to be treated in a similar 
 * way to a collection.
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class ArrayIterator<T> implements Iterator<T>
{
  public ArrayIterator(T[] array)
  {
    array_ = array;
    index_ = 0;
  } // ArrayIterator

  public boolean hasNext()
  {
    return (array_ != null) && (index_ != array_.length);
  } // hasNext

  public T next()
  {
    return array_[index_++];
  } // next

  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.ArrayIterator does not support the remove method");
  } // remove

  //////////////////////
  private T[] array_;
  private int index_;
} // ArrayIterator
