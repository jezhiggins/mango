package uk.co.jezuk.mango;

import junit.framework.*;

public class BinaryFunctionTest  extends TestCase
{
  java.util.List list;

  public BinaryFunctionTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(BinaryFunctionTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  private class Print2ndTo1st implements BinaryFunction
  {
    public Object fn(Object o1, Object o2)
    {
      java.io.PrintStream ps = (java.io.PrintStream)o1;
      ps.println(o2.toString());
      return null;
    } 
  } // Print2nd
  private class Print1stTo2nd implements BinaryFunction
  {
    public Object fn(Object o1, Object o2)
    {
      java.io.PrintStream ps = (java.io.PrintStream)o2;
      ps.println(o1.toString());
      return null;
    } 
  }

  public void test1()
  {
    Mango.forEach(list, new BinaryFunction.BindFirst(new Print2ndTo1st(), System.out));
  } // 

  public void test2()
  {
    Mango.forEach(list, new BinaryFunction.BindSecond(new Print1stTo2nd(), System.out));
  } // 
} // BinaryFunctionTest
