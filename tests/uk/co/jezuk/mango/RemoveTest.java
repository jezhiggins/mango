package uk.co.jezuk.mango;

import junit.framework.*;

public class RemoveTest  extends TestCase
{
  java.util.List list;

  public RemoveTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(RemoveTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    Algorithms.remove(list, new Integer(7));

    assertEquals(9, list.size());
    assertEquals(null, Algorithms.find(list, new Integer(7)));
  } // test1

  public void test2()
  {
    Algorithms.remove(list, 1, 5, new Integer(7));

    assertEquals(10, list.size());
    assertEquals(list.get(7), Algorithms.find(list, new Integer(7)));
  } // test2
} // FindTest
