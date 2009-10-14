package uk.co.jezuk.mango;

import junit.framework.*;

public class GreaterThanEqualsTest  extends TestCase
{
  java.util.List list;

  public GreaterThanEqualsTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(GreaterThanEqualsTest.class); }

  private BinaryPredicate p_;

  protected void setUp() 
  {
    p_ = BinaryPredicates.GreaterThanEquals();
  } // setUp

  public void test1()
  {
    assertEquals(false, p_.test(new Integer(1), new Integer(3)));
  } // test1

  public void test2()
  {
    assertEquals(false, p_.test("hello", "zibignew"));
  } // test2

  public void test3()
  {
    assertEquals(true, p_.test(new Integer(3), new Integer(1)));
  } // test3

  public void test4()
  {
    assertEquals(true, p_.test("hello", "aerosol"));
  } // test4

  public void test5()
  {
    assertEquals(true, p_.test(new Integer(3), new Integer(3)));
  } // test5

  public void test6()
  {
    assertEquals(true, p_.test("hello", "hello"));
  } // test6

  public void test7()
  {
    assertEquals(true, p_.test(null, null));
  } // test7

  public void test8()
  {
    assertEquals(false, p_.test(null, "word"));
  } // test8

  public void test9()
  {
    assertEquals(true, p_.test("word", null));
  } // test9

} // GreaterThanEqualsTest
