package uk.co.jezuk.mango;

import junit.framework.*;

public class BoundedIteratorTest  extends TestCase
{
  java.util.List list;

  public BoundedIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(BoundedIteratorTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  private class Print implements UnaryFunction 
  {
    public void fn(Object o)
    {
      System.out.println(o.toString());
    } 
  } // Print

  public void test1()
  {
    java.util.Iterator bi = new BoundedIterator(list, 2, 5);
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(2), bi.next());
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(3), bi.next());
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(4), bi.next());
    assertEquals(false, bi.hasNext());
  } // test1

  public void test2()
  {
    java.util.Iterator bi = new BoundedIterator(list, 8, 12);
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(8), bi.next());
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(9), bi.next());
    assertEquals(false, bi.hasNext());
  } // test2

  public void test3()
  {
    java.util.Iterator bi = new BoundedIterator(list, 12, 12);
    assertEquals(false, bi.hasNext());
  } // test3

  public void test4()
  {
    java.util.Iterator bi = new BoundedIterator(list.iterator(), 2, 5);
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(2), bi.next());
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(3), bi.next());
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(4), bi.next());
    assertEquals(false, bi.hasNext());
  } // test4

  public void test5()
  {
    java.util.Iterator bi = new BoundedIterator(list.iterator(), 8, 12);
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(8), bi.next());
    assertEquals(true, bi.hasNext());
    assertEquals(new Integer(9), bi.next());
    assertEquals(false, bi.hasNext());
  } // test5

  public void test6()
  {
    java.util.Iterator bi = new BoundedIterator(list.iterator(), 12, 12);
    assertEquals(false, bi.hasNext());
  } // test6
} // BoundedIteratorTest
