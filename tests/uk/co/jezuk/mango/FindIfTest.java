package uk.co.jezuk.mango;

import junit.framework.*;

public class FindIfTest  extends TestCase
{
  java.util.List list;

  public FindIfTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FindTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(list.get(2), Algorithm.findIf(list, Bind.First(Mango.EqualTo(), new Integer(2))));
    assertEquals(list.get(4), Algorithm.findIf(list, Bind.First(Mango.EqualTo(), new Integer(4))));
    assertEquals(list.get(7), Algorithm.findIf(list, Bind.First(Mango.EqualTo(), new Integer(7))));
    assertEquals(null, Algorithm.findIf(list, Bind.First(Mango.EqualTo(), new Integer(99))));
    assertEquals(null, Algorithm.findIf(list, Bind.First(Mango.EqualTo(), new String("charles dickens"))));
  } // 
} // FindIfTest
