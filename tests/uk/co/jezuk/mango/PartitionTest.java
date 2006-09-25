package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.Collection;
import java.util.ArrayList;

public class PartitionTest  extends TestCase
{
  java.util.List list;

  public PartitionTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(PartitionTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    Collection removed = Algorithms.partition(list, Bind.First(Predicates.LessThanEquals(), new Integer(7)), new ArrayList());

    assertEquals(7, list.size());
    assertEquals(null, Algorithms.find(list, new Integer(7)));
    assertEquals(null, Algorithms.find(list, new Integer(8)));
    assertEquals(null, Algorithms.find(list, new Integer(9)));
		assertEquals(3, removed.size());
    assertEquals(new Integer(7), Algorithms.find(removed, new Integer(7)));
    assertEquals(new Integer(8), Algorithms.find(removed, new Integer(8)));
    assertEquals(new Integer(9), Algorithms.find(removed, new Integer(9)));
  } // test1

  public void test2()
  {
    Collection removed = Algorithms.partition(list, 1, 5, Bind.First(Predicates.LessThanEquals(), new Integer(7)), new ArrayList());

    assertEquals(10, list.size());
    assertEquals(list.get(7), Algorithms.find(list, new Integer(7)));
		assertEquals(0, removed.size());
  } // test2
} // PartitionTest
