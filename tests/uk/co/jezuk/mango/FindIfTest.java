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
    assertEquals(list.get(2), Mango.findIf(list, Bind.First(Mango.EqualTo(), new Integer(2))));
    assertEquals(list.get(4), Mango.findIf(list, Bind.First(Mango.EqualTo(), new Integer(4))));
    assertEquals(list.get(7), Mango.findIf(list, Bind.First(Mango.EqualTo(), new Integer(7))));
    assertEquals(null, Mango.findIf(list, Bind.First(Mango.EqualTo(), new Integer(99))));
    assertEquals(null, Mango.findIf(list, Bind.First(Mango.EqualTo(), new String("charles dickens"))));
  } // 
} // FindIfTest
