package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.Iterator;

public class GeneratorIteratorTest extends TestCase
{
  public GeneratorIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(GeneratorIteratorTest.class); }

  public void test1()
  {
    Iterator<Integer> iter = Iterators.GeneratorIterator(Generators.IntegerSequence());
    assertEquals(true, iter.hasNext());
    assertEquals(new Integer(0), iter.next());
    assertEquals(true, iter.hasNext());
    assertEquals(new Integer(1), iter.next());
    assertEquals(true, iter.hasNext());
    assertEquals(new Integer(2), iter.next());
    assertEquals(true, iter.hasNext());
    assertEquals(new Integer(3), iter.next());
  } // test1
} // class GeneratorIteratorTest