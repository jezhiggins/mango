package uk.co.jezuk.mango;

import junit.framework.*;

public class FindIfNotTest  extends TestCase
{
  java.util.List list;

  public FindIfNotTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FindTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(list.get(2), Algorithms.findIfNot(list, Bind.First(Predicates.EqualTo(), new Integer(1))));
    assertEquals(list.get(4), Algorithms.findIfNot(list, Bind.First(Predicates.LessThan(), new Integer(4))));
    assertEquals(list.get(7), Algorithms.findIfNot(list, Bind.First(Predicates.LessThan(), new Integer(7))));
    assertEquals(null, Algorithms.findIfNot(list, Bind.First(Predicates.GreaterThan(), new Integer(99))));
    assertEquals(null, Algorithms.findIfNot(list, Bind.First(Predicates.NotEqualTo(), new String("charles dickens"))));
    assertEquals(list.get(1), Algorithms.findIfNot(list, Bind.First(Predicates.EqualTo(), new String("charles dickens"))));
  } // 
} // FindIfNotTest
