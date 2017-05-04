## Mango

Mango is a Java library of a iterators, algorithms and functions

```java

import java.util.Iterator;
import java.util.List;

import uk.co.jezuk.mango.Collections;
import uk.co.jezuk.mango.Iterators;

public class ZippyTriples
{
    static public void main(final String[] args)
    {
        List<String> long_weekend = Collections.list("Friday", "Saturday", "Sunday", "Monday");
        Iterator<List<String>> yesterday_today_tomorrow = prev_this_next(long_weekend);

        while(yesterday_today_tomorrow.hasNext())
        {
            List<String> ytt = yesterday_today_tomorrow.next();
            for(String d : ytt)
            {
                System.out.print(d);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static Iterator<List<String>> prev_this_next(final List<String> items)
    {
        Iterator<String> chain = Iterators.ChainIterator(null, items, null);
        List<Iterator<String>> prev_this_next = Iterators.TeeIterator(chain, 3);
        Iterator<String> prev = prev_this_next.get(0);
        Iterator<String> current = prev_this_next.get(1);
        Iterator<String> next = prev_this_next.get(2);

        current.next();
        next.next();
        next.next();

        return Iterators.ZipIterator(prev, current, next);
    }
}

```

```groovy
import uk.co.jezuk.mango.Iterators

def prev_this_next(items) {
  chain = Iterators.ChainIterator(null, items, null)
  (prev, current, next) = Iterators.TeeIterator(chain, 3)
  current.next()
  next.next()
  next.next()
  return Iterators.ZipIterator(prev, current, next)
}

long_weekend = ["Friday", "Saturday", "Sunday", "Monday"]
yesterday_today_tomorrow = prev_this_next(long_weekend)
for(ytt in yesterday_today_tomorrow)
  println ytt
```

In these modern times, Mango is largely obsoleted by Java 8 Streams.