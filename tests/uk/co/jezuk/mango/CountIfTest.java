package uk.co.jezuk.mango;

import junit.framework.*;

public class CountIfTest  extends TestCase
{
  java.util.List list;

  public CountIfTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(CountIfTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(0, Algorithm.countIf(list, Bind.First(Mango.EqualTo(), new String("hello"))));
    assertEquals(0, Algorithm.countIf(list, Bind.First(Mango.EqualTo(), null)));
    assertEquals(1, Algorithm.countIf(list, Bind.First(Mango.EqualTo(), new Integer(5))));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(5, Algorithm.countIf(list, Bind.First(Mango.EqualTo(), new Integer(5))));
  } // 

  public void test2()
  {
    assertEquals(10, Algorithm.countIf(list, Bind.First(Mango.NotEqualTo(), new String("hello"))));
    assertEquals(10, Algorithm.countIf(list, Bind.First(Mango.NotEqualTo(), null)));
    assertEquals(9, Algorithm.countIf(list, Bind.First(Mango.NotEqualTo(), new Integer(5))));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(9, Algorithm.countIf(list, Bind.First(Mango.NotEqualTo(), new Integer(5))));
  } // 
} // CountIfTest
