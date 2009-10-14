package uk.co.jezuk.mango;

import junit.framework.*;

public class BinaryNotTest  extends TestCase
{
  public BinaryNotTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(BinaryNotTest.class); }

  public void test1()
  {
    BinaryPredicate t = BinaryPredicates.Not(BinaryPredicates.EqualTo());
    assertEquals(false, t.test(new Integer(7), new Integer(7)));
    assertEquals(false, t.test(t, t));
    assertEquals(false, t.test(new String("brainfart"), new String("brainfart")));
  } // test1

  public void test2()
  {
    BinaryPredicate t = BinaryPredicates.Not(BinaryPredicates.EqualTo());
    assertEquals(true, t.test(t, new Integer(7)));
    assertEquals(true, t.test(t, null));
    assertEquals(true, t.test(new String("brainfart"), new String("brainfart and chips")));
  } // test2

} // BianryNotTest
