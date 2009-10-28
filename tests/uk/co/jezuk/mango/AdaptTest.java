package uk.co.jezuk.mango;

import junit.framework.*;

import java.util.List;
import java.util.ArrayList;

public class AdaptTest  extends TestCase
{
  List<Integer> list;

  public AdaptTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(AdaptTest.class); }

  protected void setUp()
  {
    list = new ArrayList<Integer>();
    for(int i = 0; i < 10; ++i)
      list.add(i);
  } // setUp

  public void test1()
  {
    System.out.println("test1");
    Algorithms.forEach(list, Adapt.Method(System.out, "println"));
    Algorithms.forEach(list, Adapt.Method(System.out, "println", int.class, Void.class));
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
    Algorithms.forEach(list, Adapt.Method(this.getClass(), "staticOverloadedMethod", int.class));
    Algorithms.forEach(list, Adapt.Method(AdaptTest.class, "staticOverloadedMethod", int.class, Void.class));
  } // test6

  public void test6a()
  {
    Adapt.Method(this.getClass(), "staticOverloadedMethod", String.class).fn("Hello");
  } // test6a

  class Something
  {
      Something(int i) { i_ = i; }
      public void print() { System.out.println(i_); }
      private int i_;
  } // Something

  public void test7()
  {
    System.out.println("test7");
    List l = new ArrayList<Something>();
    for(int i = 0; i < 10; ++i)
      l.add(new Something(i));

    Algorithms.forEach(l, Adapt.ArgumentMethod("print"));
    Algorithms.forEach(l, Adapt.ArgumentMethod("print", Something.class));
    Algorithms.forEach(l, Adapt.ArgumentMethod("print", Something.class, void.class));
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

  public void test10()
  {
    try { 
      // bad name
      Adapt.ArgumentMethod("fruit").fn("fruit");
      fail();
    }
    catch(RuntimeException re) { }
  } // test10

  public void test11()
  {
    try { 
      // method not on type
      Algorithms.forEach(list, Adapt.ArgumentMethod("fruit"), Something.class);
      fail();
    }
    catch(RuntimeException re) { }
  } // test11

  public void test12()
  {
    try { 
      // bad return type
      Algorithms.forEach(list, Adapt.ArgumentMethod("print"), Something.class, long.class);
      fail();
    }
    catch(RuntimeException re) { }
  } // test11

		
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

  static public void staticMethod(int o)
  {
    System.out.println(o);
  } // staticMethod

  static public void staticOverloadedMethod(int o)
  {
    System.out.println(o);
  } // staticOverloadedMethod

  static public void staticOverloadedMethod(String o)
  {
    System.out.println(o);
  } // staticOverloadedMethod
    
} // AdaptTest
