package uk.co.jezuk.mango;

import junit.framework.*;

public class FindTest  extends TestCase
{
  java.util.List list;

  public FindTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FindTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(list.get(2), Algorithms.find(list, new Integer(2)));
    assertEquals(list.get(4), Algorithms.find(list, new Integer(4)));
    assertEquals(list.get(7), Algorithms.find(list, new Integer(7)));
    assertEquals(null, Algorithms.find(list, new Integer(99)));
    assertEquals(null, Algorithms.find(list, new String("charles dickens")));
  } // 
} // FindTest
