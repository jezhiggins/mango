package uk.co.jezuk.mango;

/**
 * A <code>BinaryFunction</code> is some function taking two arguments -
 * <code>fn(x, y)</code>.
 * It returns some <code>Object</code>, and may return the same object or different objects for
 * each invocation, even given the same arguments.  It can refer to local state, perform disk reads or writes, or whatever.  
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public interface BinaryFunction
{
  abstract public Object fn(Object x, Object y);
} // BinaryFunction

