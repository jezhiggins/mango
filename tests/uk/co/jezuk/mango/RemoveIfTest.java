package uk.co.jezuk.mango;

import junit.framework.*;

public class RemoveIfTest  extends TestCase
{
  java.util.List list;

  public RemoveIfTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(RemoveIfTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    Mango.removeIf(list, Bind.First(Mango.LessThanEquals(), new Integer(7)));

    assertEquals(7, list.size());
    assertEquals(null, Mango.find(list, new Integer(7)));
    assertEquals(null, Mango.find(list, new Integer(8)));
    assertEquals(null, Mango.find(list, new Integer(9)));
  } // test1

  public void test2()
  {
    Mango.remove(list, 1, 5, Bind.First(Mango.LessThanEquals(), new Integer(7)));

    assertEquals(10, list.size());
    assertEquals(list.get(7), Mango.find(list, new Integer(7)));
  } // test2
} // RemoveIfTest
