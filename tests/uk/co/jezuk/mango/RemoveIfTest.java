package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.Collection;
import java.util.ArrayList;

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
    Algorithms.removeIf(list, Bind.First(Predicates.LessThanEquals(), new Integer(7)));

    assertEquals(7, list.size());
    assertEquals(null, Algorithms.find(list, new Integer(7)));
    assertEquals(null, Algorithms.find(list, new Integer(8)));
    assertEquals(null, Algorithms.find(list, new Integer(9)));
  } // test1

  public void test2()
  {
    Algorithms.removeIf(list, 1, 5, Bind.First(Predicates.LessThanEquals(), new Integer(7)));

    assertEquals(10, list.size());
    assertEquals(list.get(7), Algorithms.find(list, new Integer(7)));
  } // test2

} // RemoveIfTest
