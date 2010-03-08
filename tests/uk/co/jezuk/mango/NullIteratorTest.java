package uk.co.jezuk.mango;

import junit.framework.*;

public class NullIteratorTest extends TestCase
{
  public NullIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(NullIteratorTest.class); }

  public void test1()
  {
    java.util.Iterator i = Iterators.NullIterator();
    assertEquals(false, i.hasNext());
    try {
	iter.next();
	fail();
    }
    catch(NoSuchElementException e) {
    }
    
  } // test1
} // NullIteratorTest
