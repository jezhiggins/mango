package uk.co.jezuk.mango;

import junit.framework.*;

public class CountIfNotTest  extends TestCase
{
  java.util.List list;

  public CountIfNotTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(CountIfNotTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(10, Algorithms.countIfNot(list, Bind.First(Predicates.EqualTo(), new String("hello"))));
    assertEquals(10, Algorithms.countIfNot(list, Bind.First(Predicates.EqualTo(), null)));
    assertEquals(9, Algorithms.countIfNot(list, Bind.First(Predicates.EqualTo(), new Integer(5))));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(9, Algorithms.countIfNot(list, Bind.First(Predicates.EqualTo(), new Integer(5))));
  } // 

  public void test2()
  {
    assertEquals(0, Algorithms.countIfNot(list, Bind.First(Predicates.NotEqualTo(), new String("hello"))));
    assertEquals(0, Algorithms.countIfNot(list, Bind.First(Predicates.NotEqualTo(), null)));
    assertEquals(1, Algorithms.countIfNot(list, Bind.First(Predicates.NotEqualTo(), new Integer(5))));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(5, Algorithms.countIfNot(list, Bind.First(Predicates.NotEqualTo(), new Integer(5))));
  } // 
} // CountIfNotTest
