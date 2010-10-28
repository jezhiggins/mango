package uk.co.jezuk.mango.iterators;

import java.util.Collection;
import java.util.Iterator;

public class LoopOverIterableIterator<T> implements Iterator<T>
{
  private final Collection<? extends T> source_;
  private Iterator<? extends T> iter_;

  public LoopOverIterableIterator(final Collection<? extends T> source)
  {
    source_ = source;
    iter_ = source_.iterator();
  } // LoopOverIterableIterator

  public T next()
  {
    if(!iter_.hasNext())
      iter_ = source_.iterator();
    return iter_.next();
  } // next

  public boolean hasNext()
  {
    return (source_.size() != 0);
  } // hasNext

  public void remove()
  {
    iter_.remove();
  } // remove
} // LoopOverIterableIterator