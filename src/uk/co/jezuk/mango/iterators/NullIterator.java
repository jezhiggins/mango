package uk.co.jezuk.mango.iterators;

/**
 *
 * @author  jez@jezuk.co.uk
 */
public class NullIterator implements java.util.Iterator
{
  /** Creates a new instance of NullIterator */
  public boolean hasNext()
  {
    return false;
  } // hasNext
  
  public Object next()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.NullIterator does not support the next method.  In fact it's probably a logic error that you called it at all.");
  } // next
  
  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.NullIterator does not support the remove method.  In fact it's probably a logic error that you called it at all.");
  } // remove
} // NullIterator
