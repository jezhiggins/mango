package uk.co.jezuk.mango;

import junit.framework.*;

public class AdaptTest  extends TestCase
{
  java.util.List list;

  public AdaptTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(AdaptTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  public void test1()
  {
    System.out.println("test1");
    Mango.forEach(list, Adapt.Method(System.out, "println"));
  } // 

  public void test2()
  {
    try {
      // should throw
      Mango.forEach(list, Adapt.Method(System.out, "charles"));
      fail();
    } // try
    catch(RuntimeException e) {
    } // RuntimeException
  } // test2

  public void test3()
  {
    try {
      // should throw
      Mango.forEach(list, Adapt.Method(System.out, "close"));
      fail();
    } // try
    catch(RuntimeException e) {
    } // RuntimeException
  } // test3

  public void test4()
  {
    try {
      // should throw
      Mango.forEach(list, Adapt.Method(System.in, "skip"));
      fail();
    } // try
    catch(RuntimeException e) {
    } // RuntimeException
  } // test4

  public void test5()
  {
    System.out.println("test5");
    Mango.forEach(list, Adapt.Method(this, "staticMethod"));
  } // test5

  public void test6()
  {
    System.out.println("test6");
    Mango.forEach(list, Adapt.Method(this.getClass(), "staticMethod"));
  } // test6

  static public void staticMethod(Object o)
  {
    System.out.println(o);
  } // staticMethod
} // AdaptTest
