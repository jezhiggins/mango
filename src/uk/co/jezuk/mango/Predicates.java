package uk.co.jezuk.mango;

/**
 * The Mango Library Unary and Binary Predicates
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Predicates
{
  ///////////////////////////////////////////////////////
  // Unary Predicates
  /**
   * A <code>Predicate</code> which always returns <code>true</code>
   */
  static public Predicate True() { return new uk.co.jezuk.mango.unarypredicates.True(); }
  /**
   * A <code>Predicate</code> which always returns <code>false</code>
   */
  static public Predicate False() { return new uk.co.jezuk.mango.unarypredicates.False(); }
  /**
   * A <code>Predicate</code> which is the logical negation of some other <code>Predicate</code>.  If <code>n</code>
   * is a <code>Not</code> object, and <code>pred</code> is the <code>Predicate</code> it was constructed with,
   * then <code>n.test(x)</code> returns <code>!pred.test(x)</code>.
   */
  static public Predicate Not(Predicate pred) { return new uk.co.jezuk.mango.unarypredicates.Not(pred); }
  /**
   * A <code>Predicate</code> which returns the logical AND of two other <code>Predicate</code>.  If <code>a</code>
   * is an <code>And</code> object, constructed with <code>pred1</code> and <code>pred2</code>, then 
   * <code>a.test(x)</code> returns <code>pred1.test(x) && pred2.test(x)</code>
   */
  static public Predicate And(Predicate pred1, Predicate pred2) { return new uk.co.jezuk.mango.unarypredicates.And(pred1, pred2); }
  /**
   * A <code>Predicate</code> which returns the logical OR of two other <code>Predicate</code>.  If <code>a</code>
   * is an <code>Or</code> object, constructed with <code>pred1</code> and <code>pred2</code>, then 
   * <code>a.test(x)</code> returns <code>pred1.test(x) || pred2.test(x)</code>
   */
  static public Predicate Or(Predicate pred1, Predicate pred2) { return new uk.co.jezuk.mango.unarypredicates.Or(pred1, pred2); }

  /////////////////////////////////////////////////
  // Binary Predicates
  /**
   * <code>BinaryPredicate</code> testing for equality.
   * <code>true</code> if <code>x.equals(y)</code> or <code>(x == null && y == null)</code>
   */
  static public BinaryPredicate EqualTo() { return new uk.co.jezuk.mango.binarypredicates.EqualTo(); }
  /**
   * <code>BinaryPredicate</code> that returns true if <code>x</code> is greater than <code>y</code>.
   * <code>x</code> and <code>y</code> must implement the <code>java.lang.Comparable<code> interface.
   */
  static public BinaryPredicate GreaterThan() { return new uk.co.jezuk.mango.binarypredicates.GreaterThan(); }
  /**
   * <code>BinaryPredicate</code> that returns true if <code>x</code> is greater than or equal to <code>y</code>.
   * <code>x</code> and <code>y</code> must implement the <code>java.lang.Comparable<code> interface.
   */
  static public BinaryPredicate GreaterThanEquals() { return new uk.co.jezuk.mango.binarypredicates.GreaterThanEquals(); }
  /**
   * <code>BinaryPredicate</code> that returns true if <code>x</code> is less than <code>y</code>.
   * <code>x</code> and <code>y</code> must implement the <code>java.lang.Comparable<code> interface.
   */
  static public BinaryPredicate LessThan() { return new uk.co.jezuk.mango.binarypredicates.LessThan(); }
  /**
   * <code>BinaryPredicate</code> that returns true if <code>x</code> is less than or equal to <code>y</code>.
   * <code>x</code> and <code>y</code> must implement the <code>java.lang.Comparable<code> interface.
   */
  static public BinaryPredicate LessThanEquals() { return new uk.co.jezuk.mango.binarypredicates.LessThanEquals(); }
  /**
   * <code>true</code> if <code>not(x.equals(y))</code>, <code>(x == null) && not(y == null)</code> or <code>not(x == null) && (y == null)</code>
   */
  static public BinaryPredicate NotEqualTo() { return new uk.co.jezuk.mango.binarypredicates.NotEqualTo(); }
  /**
   * A <code>BinaryPredicate</code> which is the logical negation of some other <code>BinaryPredicate</code>.  If <code>n</code>
   * is a <code>Not</code> object, and <code>pred</code> is the <code>Predicate</code> it was constructed with,
   * then <code>n.test(x,y)</code> returns <code>!pred.test(x,y)</code>.
   */
  static public BinaryPredicate Not(BinaryPredicate pred) { return new uk.co.jezuk.mango.binarypredicates.Not(pred); }
  /**
   * A <code>BinaryPredicate</code> which returns the logical AND of two other <code>BinaryPredicate</code>.  If <code>a</code>
   * is an <code>And</code> object, constructed with <code>pred1</code> and <code>pred2</code>, then 
   * <code>a.test(x,y)</code> returns <code>pred1.test(x,y) && pred2.test(x,y)</code>
   */
  static public BinaryPredicate And(BinaryPredicate pred1, BinaryPredicate pred2) { return new uk.co.jezuk.mango.binarypredicates.And(pred1, pred2); }
  /**
   * A <code>BinaryPredicate</code> which returns the logical OR of two other <code>BinaryPredicate</code>.  If <code>a</code>
   * is an <code>Or</code> object, constructed with <code>pred1</code> and <code>pred2</code>, then 
   * <code>a.test(x,y)</code> returns <code>pred1.test(x,y) || pred2.test(x,y)</code>
   */
  static public BinaryPredicate Or(BinaryPredicate pred1, BinaryPredicate pred2) { return new uk.co.jezuk.mango.binarypredicates.Or(pred1, pred2); }

  //////////////////////////////////
  private Predicates() { }
} // Predicates


