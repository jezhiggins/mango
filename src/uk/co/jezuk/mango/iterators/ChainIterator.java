package uk.co.jezuk.mango.iterators;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ChainIterator<T> implements Iterator<T>
{
  private final Iterator<Iterator<T>> chain_;
  private Iterator<T> current_;

  @SuppressWarnings("unchecked")
  public ChainIterator(Object... iterables)
  {
    final List<Iterator<T>> list = new ArrayList<Iterator<T>>();

    for(final Object o : iterables)
    {
      if(o instanceof Iterable) 
        list.add(((Iterable<T>)o).iterator());
      else if(o instanceof Iterator) 
        list.add((Iterator<T>)o);
      else if(o.getClass().isArray()) 
        list.add(new ArrayIterator<T>((T[])o));
      else 
        list.add(new SingletonIterator<T>((T)o));
    } // for

    chain_ = list.iterator();
    current_ = chain_.hasNext() ? chain_.next() : null;
  } // ChainIterator

  public boolean hasNext()
  {
    if(current_ == null)
      return false;

    if(current_.hasNext())
      return true;

    current_ = chain_.hasNext() ? chain_.next() : null;
    return hasNext();
  } // hasNext

  public T next()
  {
    return current_.next();
  } // next

  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.ChainIterator does not support the remove method");
  } // remove
} // ChainIterator