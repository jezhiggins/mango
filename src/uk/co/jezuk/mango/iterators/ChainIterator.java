package uk.co.jezuk.mango.iterators;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ChainIterator<T> implements Iterator<T>
{
  private final Iterator<Iterator<T>> chain_;
  private Iterator<T> current_;

  public ChainIterator(Object... iterables)
  {
    final List<Iterator<T>> list = new ArrayList<Iterator<T>>();

    for(final Object o : iterables)
    {
      if(o instanceof Iterable) 
      {
	System.out.println(o);
        list.add(((Iterable<T>)o).iterator());
      } // if
      else if(o instanceof Iterator) 
      {
	System.out.println(o);
        list.add((Iterator<T>)o);
      } // if
      else 
      {
	System.out.println(o);
        list.add(new SingletonIterator<T>((T)o));
      } 
    } // for

    chain_ = list.iterator();
    current_ = chain_.hasNext() ? chain_.next() : null;
  } // ChainIterator

  public boolean hasNext()
  {
    return current_ != null ? current_.hasNext() : false;
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