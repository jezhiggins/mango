package uk.co.jezuk.mango;

import uk.co.jezuk.mango.algorithms.Transform;
import junit.framework.*;
import java.util.ArrayList;

public class TransformTest extends TestCase
{
    public TransformTest(String name)
    {
	super(name);
    }

    public static Test suite()
    {
	return new TestSuite(TransformTest.class);
    }

    public void test1()
    {
	ArrayList in = new ArrayList();
	in.add(new Integer(1));
	in.add(new Integer(2));
	in.add(new Integer(3));
	ArrayList out = new ArrayList();
	Transform.execute(in.iterator(), new Square(), out);
	assertEquals(3, out.size());
	assertEquals(1, ((Integer)out.get(0)).intValue());
	assertEquals(4, ((Integer)out.get(1)).intValue());
	assertEquals(9, ((Integer)out.get(2)).intValue());
    }
    
    public void test2()
    {
	ArrayList in = new ArrayList();
	in.add("A");
	in.add("B");
	in.add("C");
	ArrayList out = new ArrayList();
	Transform.execute(in.iterator(), new Duplicator(), out);
	assertEquals(6, out.size());
	assertEquals("A", out.get(0));
	assertEquals("A", out.get(1));
	assertEquals("B", out.get(2));
	assertEquals("B", out.get(3));
	assertEquals("C", out.get(4));
	assertEquals("C", out.get(5));
    }


    public class Square implements UnaryFunction
    {
	public Object fn(Object x)
	{
	    if (x instanceof Integer)
	    {
		return new Integer(((Integer)x).intValue() * ((Integer)x).intValue());
	    }
	    return null;
	}
    }

    public class Duplicator implements UnaryFunction
    {
	public Object fn(Object x)
	{
	    if (x instanceof String)
	    {
		ArrayList ret = new ArrayList();
		ret.add(new String((String)x));
		ret.add(new String((String)x));
		return ret;
	    }
	    return null;
	}
    }
}
