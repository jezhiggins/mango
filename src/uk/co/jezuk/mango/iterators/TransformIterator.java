package uk.co.jezuk.mango.iterators;

/**
 * A <code>TransfromIterator</code> applies a <code>UnaryFunction</code> to 
 * each element in the sequence, returning the the function result at each step.
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class TransformIterator implements java.util.Iterator
{
  public TransformIterator(java.util.Iterator iterator, uk.co.jezuk.mango.UnaryFunction transform)
  {
    iter_ = iterator;
    transform_ = transform;
  } // TransformIterator

  public boolean hasNext()
  {
    return iter_.hasNext();
  } // hasNext

  public Object next()
  {
    return transform_.fn(iter_.next());
  } // next

  public void remove()
  {
    iter_.remove();
  } // remove

  ////////////////////////
  private java.util.Iterator iter_;
  private uk.co.jezuk.mango.UnaryFunction transform_;
} // TransformIterator


