package uk.co.jezuk.mango.iterators;

/**
 * Iterators over an object array, allowing to be treated in a similar 
 * way to a collection.
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class ArrayIterator implements java.util.Iterator
{
  public ArrayIterator(Object[] array)
  {
    array_ = array;
    index_ = 0;
  } // ArrayIterator

  public boolean hasNext()
  {
    return (array_ != null) && (index_ != array_.length);
  } // hasNext

  public Object next()
  {
    return array_[index_++];
  } // next

  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.ArrayIterator does not support the remove method");
  } // remove

  //////////////////////
  private Object[] array_;
  private int index_;
} // ArrayIterator
