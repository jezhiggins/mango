package uk.co.jezuk.mango;

import junit.framework.*;

public class CountTest  extends TestCase
{
  java.util.List list;

  public CountTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(CountTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(0, Algorithm.count(list, new String("hello")));
    assertEquals(0, Algorithm.count(list, null));
    assertEquals(1, Algorithm.count(list, new Integer(5)));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(5, Algorithm.count(list, new Integer(5)));
  } // 
} // CountTest
