package uk.co.jezuk.mango;

import junit.framework.*;

public class ArrayIteratorTest  extends TestCase
{
  public ArrayIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(ArrayIteratorTest.class); }

  public void test1()
  {
    java.util.Iterator i = Mango.ArrayIterator(new String[]{ "one", "two", "three" } );
    assertEquals(true, i.hasNext());
    assertEquals("one", i.next());
    assertEquals(true, i.hasNext());
    assertEquals("two", i.next());
    assertEquals(true, i.hasNext());
    assertEquals("three", i.next());
    assertEquals(false, i.hasNext());
  } // test1

  public void test2()
  {
    java.util.Iterator i = Mango.ArrayIterator(null);
    assertEquals(false, i.hasNext());
  } // test2
} // ArrayIteratorTest
