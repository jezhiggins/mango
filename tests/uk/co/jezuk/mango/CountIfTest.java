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
    assertEquals(0, Mango.countIf(list, new EqualTo(new String("hello"))));
    assertEquals(0, Mango.countIf(list, new EqualTo(null)));
    assertEquals(1, Mango.countIf(list, new EqualTo(new Integer(5))));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(5, Mango.countIf(list, new EqualTo(new Integer(5))));
  } // 

  public void test2()
  {
    assertEquals(0, Mango.countIf(list, Bind.First(new EqualTo(), new String("hello"))));
    assertEquals(0, Mango.countIf(list, Bind.First(new EqualTo(), null)));
    assertEquals(1, Mango.countIf(list, Bind.First(new EqualTo(), new Integer(5))));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    list.add(new Integer(5));
    assertEquals(5, Mango.countIf(list, Bind.First(new EqualTo(), new Integer(5))));
  } // 
} // CountIfTest
