package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.List;
import java.util.ArrayList;

/** 
 * @version $Id: MutatingTest.java 649 2006-09-08 11:44:15Z jez $
 */
public class UniqueTest extends TestCase 
{
	public UniqueTest(String name) { super(name);  }
  
	public static Test suite() { return new TestSuite(UniqueTest.class); }

	protected void setUp() { }
	
	public void test1()
	{
		List list = new ArrayList();
		Algorithms.unique(list);
	} // test1

	public void test2()
	{
		List list = new ArrayList();
		list.add("one");
		
		Algorithms.unique(list);
		assertEquals(1, list.size());
	} // test2
	
	public void test3()
	{
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		
		Algorithms.unique(list);
		assertEquals(2, list.size());
	} // test3
	
	public void test4()
	{
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Algorithms.unique(list);
		assertEquals(5, list.size());
	} // test4
	
	public void test5()
	{
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Algorithms.unique(list);
		assertEquals(5, list.size());
	} // test5
	
	public void test6()
	{
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Algorithms.unique(list);
		assertEquals(5, list.size());
	} // test6
	
	public void test7()
	{
		List list = new ArrayList();
		list.add("one");
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("three");
		list.add("four");
		list.add("four");
		list.add("five");
		list.add("five");
		
		Algorithms.unique(list);
		assertEquals(5, list.size());
	} // test6
} // class UniqueTest
