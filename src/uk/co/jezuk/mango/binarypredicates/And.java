package uk.co.jezuk.mango.binarypredicates;

import uk.co.jezuk.mango.BinaryPredicate;

public class And implements BinaryPredicate
{
  public And(BinaryPredicate pred1, BinaryPredicate pred2) { p1_ = pred1; p2_ = pred2; }
  public boolean test(Object x, Object y) { return p1_.test(x,y) && p2_.test(x,y); }

  private BinaryPredicate p1_;
  private BinaryPredicate p2_;
} // And
