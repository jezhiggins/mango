package uk.co.jezuk.mango;

import junit.framework.*;

public class FilteredIteratorTest  extends TestCase
{
  java.util.List list;

  public FilteredIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FilteredIteratorTest.class); }

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
    java.util.Iterator iter = Iterators.FilteredIterator(list.iterator(), new LessThanFive());
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

    java.util.Iterator iter = Iterators.FilteredIterator(list.iterator(), 
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
} // 
