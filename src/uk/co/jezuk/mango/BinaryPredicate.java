package uk.co.jezuk.mango;

/**
 * A <code>BinaryPredicate</code> is some function taking two arguments -
 * <code>fn(x, y)</code> and returning the result of some test.
 * It returns <code>true</code> if the conditions of the test are satisfied,
 * <code>false</code> otherwise
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public interface BinaryPredicate
{
  abstract public boolean test(Object x, Object y);
} // BinaryPredicate

