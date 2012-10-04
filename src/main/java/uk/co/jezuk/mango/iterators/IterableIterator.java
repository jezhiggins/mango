package uk.co.jezuk.mango.iterators;

import java.util.Iterator;

public class IterableIterator<T> implements Iterator<T>, Iterable<T>
{
  private Iterator<T> iter_;

  public IterableIterator(final Iterator<T> iter) { iter_ = iter; }

  public boolean hasNext() { return iter_.hasNext(); }
  public T next() { return iter_.next(); }
  public void remove() { iter_.remove(); }

  public Iterator<T> iterator() { return iter_; }
} // class IterableIterator