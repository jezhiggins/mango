package uk.co.jezuk.mango;

import junit.framework.*;

public class FalseTest  extends TestCase
{
  public FalseTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(FalseTest.class); }

  public void test1()
  {
    Predicate t = Mango.False();
    assertEquals(false, t.test(new Integer(7)));
    assertEquals(false, t.test(t));
    assertEquals(false, t.test(new String("brainfart")));
  } // test1

} // FalseTest
