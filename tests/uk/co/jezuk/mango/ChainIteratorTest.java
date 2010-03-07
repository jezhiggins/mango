package uk.co.jezuk.mango;

import junit.framework.*;
import java.util.Iterator;

public class ChainIteratorTest extends TestCase
{
    public ChainIteratorTest(String name) { super(name); }
    public static Test suite() { return new TestSuite(ChainIteratorTest.class); }

    public void test1()
    {
      Iterator<String> i = Iterators.ChainIterator(Iterators.NullIterator());
      assertEquals(false, i.hasNext());
    } // test1

    public void test2()
    {
      Iterator<String> i = Iterators.ChainIterator("fish");
      assertEquals(true, i.hasNext());
      assertEquals("fish", i.next());
      assertEquals(false, i.hasNext());
    } // test2
} // ChainIteratorTest