package uk.co.jezuk.mango;

import junit.framework.*;

public class UnaryOrTest  extends TestCase
{
  public UnaryOrTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(UnaryOrTest.class); }

  public void test1()
  {
    Predicate t = Predicates.Or(Predicates.True(), Predicates.True());
    assertEquals(true, t.test(null));
  } // test1

  public void test2()
  {
    Predicate t = Predicates.Or(Predicates.False(), Predicates.True());
    assertEquals(true, t.test(null));
  } // test2

  public void test3()
  {
    Predicate t = Predicates.Or(Predicates.True(), Predicates.False());
    assertEquals(true, t.test(null));
  } // test3

  public void test4()
  {
    Predicate t = Predicates.Or(Predicates.False(), Predicates.False());
    assertEquals(false, t.test(null));
  } // test4
} // UnaryOrTest
