package uk.co.jezuk.mango.binarypredicates;

/**
 * @version $Id$
 */
public class And implements uk.co.jezuk.mango.BinaryPredicate
{
  public And(uk.co.jezuk.mango.BinaryPredicate pred1, uk.co.jezuk.mango.BinaryPredicate pred2) { p1_ = pred1; p2_ = pred2; }
  public boolean test(Object x, Object y) { return p1_.test(x,y) && p2_.test(x,y); }

  private uk.co.jezuk.mango.BinaryPredicate p1_;
  private uk.co.jezuk.mango.BinaryPredicate p2_;
} // And
