package uk.co.jezuk.mango;

import junit.framework.*;

public class SingletonIteratorTest  extends TestCase
{
  public SingletonIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(SingletonIteratorTest.class); }

  public void test1()
  {
    java.util.Iterator i = Mango.SingletonIterator(new String("one"));
    assertEquals(true, i.hasNext());
    assertEquals("one", i.next());
    assertEquals(false, i.hasNext());
  } // test1

  public void test2()
  {
      java.util.Iterator i = Mango.SingletonIterator(null);
    assertEquals(false, i.hasNext());
  } // test2
} // SingletonIteratorTest
