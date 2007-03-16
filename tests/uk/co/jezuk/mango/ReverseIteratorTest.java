package uk.co.jezuk.mango;

import junit.framework.*;

public class ReverseIteratorTest extends TestCase
{
  java.util.List list;

  public ReverseIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(ReverseIteratorTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    java.util.Iterator iter = Iterators.ReverseIterator(list);
    for(int i = 9; i >= 0; --i)
    {
      assertTrue(iter.hasNext());
      assertEquals(list.get(i), iter.next());
    } 
    assertFalse(iter.hasNext());
  } 
}