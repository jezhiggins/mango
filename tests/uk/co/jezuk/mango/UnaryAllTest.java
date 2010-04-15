package uk.co.jezuk.mango;

import junit.framework.*;

public class UnaryAllTest extends TestCase
{
  public UnaryAllTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(UnaryAllTest.class); }

  public void test1()
  {
    Predicate<Object> t = Predicates.All(Predicates.True());
    assertEquals(true, t.test(null));
  } // test1

  public void test2()
  {
    Predicate<Object> t = Predicates.All(Predicates.False());
    assertEquals(false, t.test(null));
  } // test2

  public void test3()
  {
    Predicate<Object> t = Predicates.All(Predicates.True(),
                                         Predicates.True());
    assertEquals(true, t.test(null));
  } // test3

  public void test4()
  {
    Predicate<Object> t = Predicates.All(Predicates.True(),
                                         Predicates.False());
    assertEquals(false, t.test(null));
  } // test4

  public void test5()
  {
    Predicate<Object> t = Predicates.All(Predicates.False(),
                                         Predicates.True());
    assertEquals(false, t.test(null));
  } // test5

  public void test6()
  {
    Predicate<Object> t = Predicates.All(Predicates.False(),
                                         Predicates.False());
    assertEquals(false, t.test(null));
  } // test6

  public void test7()
  {
    Predicate<Object> t = Predicates.All(Predicates.True(), 
                                         Predicates.True(),
                                         Predicates.True());
    assertEquals(true, t.test(null));
  } // test7

  public void test8()
  {
    Predicate<Object> t = Predicates.All(Predicates.True(), 
                                         Predicates.False(),
                                         Predicates.False());
    assertEquals(false, t.test(null));
  } // test8

  public void test9()
  {
    Predicate<Object> t = Predicates.All(Predicates.False(), 
                                         Predicates.True(),
                                         Predicates.False());
    assertEquals(false, t.test(null));
  } // test9

  public void test10()
  {
    Predicate<Object> t = Predicates.All(Predicates.False(), 
                                         Predicates.False(),
                                         Predicates.True());
    assertEquals(false, t.test(null));
  } // test1

  public void test11()
  {
    Predicate<Object> t = Predicates.All(Predicates.True(), 
                                         Predicates.True(),
                                         Predicates.False());
    assertEquals(false, t.test(null));
  } // test1

  public void test12()
  {
    Predicate<Object> t = Predicates.All(Predicates.False(), 
                                         Predicates.True(),
                                         Predicates.True());
    assertEquals(false, t.test(null));
  } // test12

  public void test13()
  {
    Predicate<Object> t = Predicates.All(Predicates.True(), 
                                         Predicates.False(),
                                         Predicates.True());
    assertEquals(false, t.test(null));
  } // test13

  public void test14()
  {
    Predicate<Object> t = Predicates.All(Predicates.False(), 
                                         Predicates.False(),
                                         Predicates.False());
    assertEquals(false, t.test(null));
  } // test14

} // class UnaryAllTest