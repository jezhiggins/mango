package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LoopingIteratorTest  extends TestCase
{
  List<Integer> list;

  public LoopingIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(LoopingIteratorTest.class); }

  protected void setUp()
  {
    list = new ArrayList<Integer>();
    for(int i = 0; i < 5; ++i)
      list.add(i);
  } // setUp

  public void testLoopOverList2()
  {
    final Iterator<Integer> iter = Iterators.LoopingIterator(list);

    for(int i = 0; i < 5; ++i)
      for(int j = 0; j < 5; ++j)
	assertEquals(j, (int)iter.next());
  } // testLoopOverList

  public void testLoopOverListAndRemove()
  {
    final Iterator<Integer> iter = Iterators.LoopingIterator(list);

    for(int j = 0; j < 5; ++j)
      assertEquals(j, (int)iter.next());
    for(int j = 0; j < 5; ++j)
    {
      assertTrue(iter.hasNext());
      assertEquals(j, (int)iter.next());
      iter.remove();
    } // for ...
    assertFalse(iter.hasNext());    
  } // testLoopOverListAndRemove

} // 


