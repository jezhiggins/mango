package uk.co.jezuk.mango;

/**
 * A <code>PredicatedIterator</code> enumerates only those elements of a collection
 * that match the supplied <code>Predicate</code>.
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class PredicatedIterator implements java.util.Iterator
{
  public PredicatedIterator(java.util.Iterator iterator, Predicate predicate)
  {
    iter_ = iterator;
    pred_ = predicate;

    findNext();
  } // PredicatedIterator

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
    // throw something
  } // remove

  private void findNext()
  {
    next_ = null;
    while(iter_.hasNext() && next_ == null)
    {
      Object candidate = iter_.next();
      if(pred_.test(candidate))
        next_ = candidate;
    } // while
  } // findNext

  ////////////////////////
  private java.util.Iterator iter_;
  private Predicate pred_;
  private Object next_;
} // PredicatedIterator


