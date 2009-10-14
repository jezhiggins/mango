package uk.co.jezuk.mango;

import junit.framework.*;

public class FindPositionIfTest  extends TestCase
{
  java.util.List list;

  public FindPositionIfTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FindPositionIfTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    assertEquals(2, Algorithms.findPositionIf(list, 
																							Bind.First(BinaryPredicates.EqualTo(), new Integer(2))
																							));
	}

  public void test2()
  {
    assertEquals(4, Algorithms.findPositionIf(list, 	
																							Bind.First(BinaryPredicates.EqualTo(), new Integer(4))
																							));
	}

  public void test3()
  {
    assertEquals(7, Algorithms.findPositionIf(list, 
 																							Bind.First(BinaryPredicates.EqualTo(), new Integer(7))
																							));
	}

  public void test4()
  {
    assertEquals(-1, Algorithms.findPositionIf(list, 
 																							Bind.First(BinaryPredicates.EqualTo(), new Integer(99))
																							));
	}

  public void test5()
  {
    assertEquals(-1, Algorithms.findPositionIf(list, 
																							 Bind.First(BinaryPredicates.EqualTo(), new String("charles dickens"))
																							 )); 
  } // 
} // FindPositionIfTest
