package uk.co.jezuk.mango.unarypredicates;

/**
 * @version $Id$
 */
public class Not implements uk.co.jezuk.mango.Predicate
{
  public Not(uk.co.jezuk.mango.Predicate p) { p_ = p; }
  public boolean test(Object x) { return !p_.test(x); }

  private uk.co.jezuk.mango.Predicate p_;
} // Not
