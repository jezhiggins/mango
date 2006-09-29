package uk.co.jezuk.mango.iterators;

/**
 * A <code>SelectingIterator</code> enumerates only those elements of a collection
 * that match the supplied <code>Predicate</code>.
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class SelectingIterator implements java.util.Iterator
{
  public SelectingIterator(java.util.Iterator iterator, uk.co.jezuk.mango.Predicate predicate)
  {
    iter_ = iterator;
    pred_ = predicate;
  } // SelectingIterator

  public boolean hasNext()
  {
    next_ = null;
    while(iter_.hasNext() && next_ == null)
    {
      Object candidate = iter_.next();
      if(pred_.test(candidate))
        next_ = candidate;
    } // while
		return next_ != null;
  } // hasNext

  public Object next()
  {
    return next_;
  } // next

  public void remove()
  {
		iter_.remove();
  } // remove

  ////////////////////////
  private java.util.Iterator iter_;
  private uk.co.jezuk.mango.Predicate pred_;
  private Object next_;
} // SelectingIterator


