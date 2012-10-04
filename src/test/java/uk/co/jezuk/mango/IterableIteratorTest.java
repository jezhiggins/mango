package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.Iterator;
import uk.co.jezuk.mango.iterators.IterableIterator;

public class IterableIteratorTest extends TestCase
{
  public IterableIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(IterableIteratorTest.class);
  }

  public void test1()
  {
    Iterable<String> string  = new IterableIterator<String>(Iterators.SingletonIterator("one"));
    for(final String s : string)
      assertEquals("one", s);
  } // test1
} // class IterableIteratorTest
