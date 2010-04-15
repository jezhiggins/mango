package uk.co.jezuk.mango.unarypredicates;

import uk.co.jezuk.mango.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class All<T> implements Predicate<T>
{
  public All(Iterator<Predicate<T>> preds)
  {
    preds_ = new ArrayList<Predicate<T>>();
    while(preds.hasNext())
      preds_.add(preds.next());
  } // All

  public boolean test(T x)
  {
    for(Iterator<Predicate<T>> i = preds_.iterator(); i.hasNext(); )
      if(!i.next().test(x))
        return false;
    return true;
  } // boolean

  private final List<Predicate<T>> preds_;
} // All