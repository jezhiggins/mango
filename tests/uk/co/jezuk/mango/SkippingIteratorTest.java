package uk.co.jezuk.mango;

import junit.framework.*;

public class SkippingIteratorTest  extends TestCase
{
  java.util.List list;

  public SkippingIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(SkippingIteratorTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  class LessThanFive implements Predicate
  {
    public boolean test(Object obj)
    {
      Integer i = (Integer)obj;
      return i.intValue() < 5;
    } // test
  }
  
  public void test1()
  {
    java.util.Iterator iter = Iterators.SkippingIterator(list.iterator(), new LessThanFive());

    assertEquals(new Integer(5), iter.next());
    assertEquals(new Integer(6), iter.next());
    assertEquals(new Integer(7), iter.next());
    assertEquals(new Integer(8), iter.next());
    assertEquals(new Integer(9), iter.next());
  } // test1

  public void test2()
  {
    list = new java.util.ArrayList();
    list.add("hawkeye pierce");
    list.add("sacremento");
    list.add("GOBBLE");
    list.add("SINGLETON");
    list.add("BILBO");
    list.add("ERNEST");
    list.add("DAVID");
    list.add("BILLY");
    list.add("SCAGGS");
    list.add("CHARLES");
    list.add("SIMEON");

    java.util.Iterator iter = Iterators.SkippingIterator(list.iterator(), 
                                       new Predicate() {
                                           public boolean test(Object o) {
                                             String s = (String)o;
                                             return s.charAt(0) == 'S';
                                           }
                                       });
    int i = 0;
    while(iter.hasNext())
    {
      ++i;
      String s = (String)iter.next();
      assertEquals(false, s.startsWith("S"));
    } // while
    assertEquals(8, i);
  } // test2
} // 
