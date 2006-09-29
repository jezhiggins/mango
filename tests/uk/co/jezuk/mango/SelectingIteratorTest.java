package uk.co.jezuk.mango;

import junit.framework.*;

public class SelectingIteratorTest  extends TestCase
{
  java.util.List list;

  public SelectingIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(SelectingIteratorTest.class); }

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
    java.util.Iterator iter = Iterators.SelectingIterator(list.iterator(), new LessThanFive());
    int i = 0;
    while(iter.hasNext())
    {
      ++i;
      iter.next();
    } // while ...

    assertEquals(5, i);
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

    java.util.Iterator iter = Iterators.SelectingIterator(list.iterator(), 
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
      assertEquals(true, s.startsWith("S"));
    } // while
    assertEquals(3, i);
  } // test2

  public void test3()
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

    java.util.Iterator iter = Iterators.SelectingIterator(list.iterator(), 
                                       new Predicate() {
                                           public boolean test(Object o) {
                                             String s = (String)o;
                                             return s.charAt(0) == 'S';
                                           }
                                       });
    while(iter.hasNext())
			iter.remove();

		assertEquals(8, list.size());
    assertEquals("hawkeye pierce", list.get(0));
    assertEquals("sacremento", list.get(1));
    assertEquals("GOBBLE", list.get(2));
    assertEquals("BILBO", list.get(3));
    assertEquals("ERNEST", list.get(4));
    assertEquals("DAVID", list.get(5));
    assertEquals("BILLY", list.get(6));
    assertEquals("CHARLES", list.get(7));
  } // test3
} // 
