package uk.co.jezuk.mango.binarypredicates;

/**
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Not implements uk.co.jezuk.mango.BinaryPredicate
{
  public Not(uk.co.jezuk.mango.BinaryPredicate p) { p_ = p; }
  public boolean test(Object x, Object y) { return !p_.test(x, y); }
  private uk.co.jezuk.mango.BinaryPredicate p_;
} // Not
