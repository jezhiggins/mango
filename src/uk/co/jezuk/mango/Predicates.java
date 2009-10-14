package uk.co.jezuk.mango;

import uk.co.jezuk.mango.unarypredicates.*;

/**
 * The Mango Library Unary Predicates
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class Predicates
{
  ///////////////////////////////////////////////////////
  // Unary Predicates
  /**
   * A <code>Predicate</code> which always returns <code>true</code>
   */
  static public <T> Predicate<T> True() { return new True<T>(); }

  /**
   * A <code>Predicate</code> which always returns <code>false</code>
   */
  static public <T> Predicate<T> False() { return new False<T>(); }

  /**
   * A <code>Predicate</code> which is the logical negation of some other <code>Predicate</code>.  If <code>n</code>
   * is a <code>Not</code> object, and <code>pred</code> is the <code>Predicate</code> it was constructed with,
   * then <code>n.test(x)</code> returns <code>!pred.test(x)</code>.
   */
  static public <T> Predicate<T> Not(Predicate<T> pred) { return new Not<T>(pred); }

  /**
   * A <code>Predicate</code> which returns the logical AND of two other <code>Predicate</code>.  If <code>a</code>
   * is an <code>And</code> object, constructed with <code>pred1</code> and <code>pred2</code>, then 
   * <code>a.test(x)</code> returns <code>pred1.test(x) && pred2.test(x)</code>
   */
  static public <T> Predicate<T> And(Predicate<T> pred1, Predicate<T> pred2) { return new And(pred1, pred2); }

  /**
   * A <code>Predicate<T></code> which returns the logical OR of two other <code>Predicate<T></code>.  If <code>a</code>
   * is an <code>Or</code> object, constructed with <code>pred1</code> and <code>pred2</code>, then 
   * <code>a.test(x)</code> returns <code>pred1.test(x) || pred2.test(x)</code>
   */
  static public <T> Predicate<T> Or(Predicate<T> pred1, Predicate<T> pred2) { return new Or(pred1, pred2); }

  //////////////////////////////////
  private Predicates() { }
} // Predicates


