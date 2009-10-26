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
    Algorithms.forEach(list, Adapt.Method(System.out, "println"));
  } // 

  public void test2()
  {
    try {
      // should throw
      Algorithms.forEach(list, Adapt.Method(System.out, "charles"));
      fail();
    } // try
    catch(RuntimeException e) {
    } // RuntimeException
  } // test2

  public void test3()
  {
    try {
      // should throw
      Algorithms.forEach(list, Adapt.Method(System.out, "close"));
      fail();
    } // try
    catch(RuntimeException e) {
    } // RuntimeException
  } // test3

  public void test4()
  {
    try {
      // should throw
      Algorithms.forEach(list, Adapt.Method(System.in, "bongo"));
      fail();
    } // try
    catch(RuntimeException e) {
    } // RuntimeException
  } // test4

  public void test5()
  {
    System.out.println("test5");
    Algorithms.forEach(list, Adapt.Method(this, "staticMethod"));
  } // test5

  public void test6()
  {
    System.out.println("test6");
    Algorithms.forEach(list, Adapt.Method(this.getClass(), "staticMethod"));
  } // test6

  class Something
  {
      Something(int i) { i_ = i; }
      public void print() { System.out.println(i_); }
      private int i_;
  } // Something

  public void test7()
  {
    System.out.println("test7");
    java.util.List l = new java.util.ArrayList();
    for(int i = 0; i < 10000; ++i)
	l.add(new Something(i));

    Algorithms.forEach(l, Adapt.ArgumentMethod("print"));
  } // test7

  public void test8()
  {
    Function<String, String> fn = Functions.Compose(new AppendX(), new AppendX());
    assertEquals("helloXX", fn.fn("hello"));
  } // test8

  public void test9()
  {
    BinaryFunction<String, String, String> fn = 
	BinaryFunctions.Compose(new Concat(), new AppendX(), new AppendX());
    assertEquals("helloXworldX", fn.fn("hello", "world"));
  } // test9
		
  static public class Concat implements BinaryFunction<String, String, String>
  {
    public String fn(String x, String y)
    {
      return x+y;
    } // fn
  } // Concat
  

  static public class AppendX implements Function<String, String>
  {
    public String fn(String x)
    {
      return x+'X';
    } 
  } // AppendX
    

  static public void staticMethod(Object o)
  {
    System.out.println(o);
  } // staticMethod
} // AdaptTest
