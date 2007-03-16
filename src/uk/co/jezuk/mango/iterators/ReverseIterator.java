package uk.co.jezuk.mango.iterators;

/**
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class ReverseIterator implements java.util.Iterator
{
  public ReverseIterator(java.util.List list)
  {
    iter_ = list.listIterator(list.size());
  } // ReverseIterator

  public boolean hasNext()
  {
    return iter_.hasPrevious();
  } // hasNext

  public Object next()
  {
    return iter_.previous();
  } // next

  public void remove()
  {
    iter_.remove();
  } // remove

  private java.util.ListIterator iter_;
} // class ReverseIterator