package uk.co.jezuk.mango;

import junit.framework.*;

public class FindIfTest  extends TestCase
{
  java.util.List list;

  public FindIfTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FindIfTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(list.get(2), Algorithms.findIf(list, Bind.First(Predicates.EqualTo(), new Integer(2))));
  }

  public void test2()
  {
    assertEquals(list.get(4), Algorithms.findIf(list, Bind.First(Predicates.EqualTo(), new Integer(4))));
  } 

  public void test3()
  {
    assertEquals(list.get(7), Algorithms.findIf(list, Bind.First(Predicates.EqualTo(), new Integer(7))));
  }

  public void test4()
  {
    assertEquals(null, Algorithms.findIf(list, Bind.First(Predicates.EqualTo(), new Integer(99))));
  } 

  public void test5()
  {
    assertEquals(null, Algorithms.findIf(list, Bind.First(Predicates.EqualTo(), new String("charles dickens"))));
  } // 
} // FindIfTest
