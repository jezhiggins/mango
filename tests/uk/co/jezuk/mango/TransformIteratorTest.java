package uk.co.jezuk.mango;

import junit.framework.*;

public class TransformIteratorTest  extends TestCase
{
  java.util.List list;

  public TransformIteratorTest(String name) { super(name); }
  public static Test suite() { return new TestSuite(TransformIteratorTest.class); }

  protected void setUp()
  {
    list = new java.util.ArrayList();
    for(int i = 0; i < 10; ++i)
      list.add(new Integer(i));
  } // setUp

  class DoubleUp implements UnaryFunction
  {
    public Object fn(Object obj)
    {
      Integer i = (Integer)obj;
      return new Integer(i.intValue() * 2);
    } // test
  }
  
  public void test1()
  {
    java.util.Iterator iter = Iterators.TransformIterator(list.iterator(), new DoubleUp());

    int i = 0;
    while(iter.hasNext())
    {
      Integer n = (Integer)iter.next();
      assertEquals(n.intValue(), i);
      i += 2;
    } // while ...
  } // test1

  class NameObject 
  {
    public NameObject(String name) { name_ = name; }
    
    public String getName() { return name_; }

    private String name_;
  } // NameObject

  public void test2()
  {
    list = new java.util.ArrayList();
    list.add(new NameObject("hawkeye pierce"));
    list.add(new NameObject("sacremento"));
    list.add(new NameObject("GOBBLE"));
    list.add(new NameObject("SINGLETON"));
    list.add(new NameObject("BILBO"));
    NameObject theOneIWant = new NameObject("CORGAN");
    list.add(theOneIWant);
    list.add(new NameObject("ERNEST"));
    list.add(new NameObject("DAVID"));
    list.add(new NameObject("BILLY"));
    list.add(new NameObject("SCAGGS"));
    list.add(new NameObject("CHARLES"));
    list.add(new NameObject("SIMEON"));

    // find the object called CORGAN
    String found = (String)Algorithms.find(Iterators.TransformIterator(list.iterator(), 
					      Adapt.ArgumentMethod("getName")),
					      new String("CORGAN"));
    assertEquals("CORGAN", found);
  } // test2
} // 


