package uk.co.jezuk.mango.iterators;

/**
 * A <code>SkippingIterator</code> enumerates a sequence,
 * stepping over the elements
 * that match the supplied <code>Predicate</code>.
 * 
 * @see PredicatedIterator
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class SkippingIterator implements java.util.Iterator
{
  public SkippingIterator(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate predicate)
  {
    iter_ = iterator;
    pred_ = predicate;

    findNext();
  } // SkippingIterator

  public boolean hasNext()
  {
    return (next_ != null);
  } // hasNext

  public Object next()
  {
    Object current = next_;
    findNext();
    return current;
  } // next

  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.SkippingIterator does not support the remove method");
  } // remove

  private void findNext()
  {
    next_ = null;
    while(iter_.hasNext() && next_ == null)
    {
      Object candidate = iter_.next();
      if(!pred_.test(candidate))
        next_ = candidate;
    } // while
  } // findNext

  ////////////////////////
  private java.util.Iterator iter_;
  private uk.co.jezuk.mango.Predicate pred_;
  private Object next_;
} // SkippingIterator


