package uk.co.jezuk.mango;

import junit.framework.*;

public class IdentityTest  extends TestCase
{
  public IdentityTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(IdentityTest.class); }

  public void test1()
  {
    UnaryFunction i = Functions.Identity();
    assertEquals(this, i.fn(this));
		assertEquals(null, i.fn(null));
		assertEquals("hello", i.fn("hello"));
		assertEquals(i, i.fn(i));
  } // test1
} // IdentityTest
