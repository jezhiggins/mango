package uk.co.jezuk.mango.unarypredicates;

/**
 * @version $Id$
 */
public class Or implements uk.co.jezuk.mango.Predicate
{
  public Or(uk.co.jezuk.mango.Predicate pred1, uk.co.jezuk.mango.Predicate pred2) { p1_ = pred1; p2_ = pred2; }
  public boolean test(Object x) { return p1_.test(x) || p2_.test(x); }

  private uk.co.jezuk.mango.Predicate p1_;
  private uk.co.jezuk.mango.Predicate p2_;
} // Or
