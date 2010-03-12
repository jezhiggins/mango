package uk.co.jezuk.mango.collections;

import java.util.List;
import java.util.ArrayList;

public class ListFactory<T>
{
  @SuppressWarnings("unchecked")
  static public <T> List<T> list(final Object... values)
  {
    final List<T> l = new ArrayList<T>();
    
    for(final Object o : values)
      l.add((T)o);

    return l;
  } // list
} // ListFactory