package uk.co.jezuk.mango;

/**
 * Function and Predicate binding adaptors.
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Bind
{
  /**
   * Adapts a <code>BinaryFunction</code> into a <code>Function</code>.
   * If <code>f</code> is an object implementing <code>BinaryFunction</code>, then
   * <code>Bind.First(f, C).fn(arg)</code> returns <code>f(C, arg)</code>.<p>
   * Intuitively, you can think of this as "binding" the first argument of a 
   * <code>BinaryFunction</code> to a constant, thus giving a <code>Function</code>.
   */
  static public Function First(final BinaryFunction f, final Object c)
  {
    return new Function() {
	private BinaryFunction fn_;
	private Object c_;
	{ fn_ = f; c_ = c; }
	public Object fn(Object arg) { return fn_.fn(c_, arg); }
      };
  } // First

  /**
   * Special case which adapts a <code>BinaryPredicate</code> to a <code>Predicate</code>.
   * If <code>p</code> is a <code>BinaryPredicate</code>, then <code>Bind.First(p, C).test(arg)</code>
   * returns <code>p.test(C, arg)</code>.
   */
  static public Predicate First(final BinaryPredicate p, final Object c)
  {
    return new Predicate() {
	private BinaryPredicate test_;
	private Object c_;
	{ test_ = p; c_ = c; }
	public boolean test(Object arg) { return test_.test(c_, arg); }
      };
  } // First

  /**
   * Adapts a <code>BinaryFunction</code> into a <code>Function</code>.
   * If <code>f</code> is an object implementing <code>BinaryFunction</code>, then
   * <code>Bind.Second(f, C).fn(arg)</code> returns <code>f(arg, C)</code>.<p>
   * Intuitively, you can think of this as "binding" the second argument of a 
   * <code>BinaryFunction</code> to a constant, thus giving a <code>Function</code>.
   */
  static public Function Second(final BinaryFunction f, final Object c)
  {
    return new Function() {
	private BinaryFunction fn_;
	private Object c_;
	{ fn_ = f; c_ = c; }
	public Object fn(Object arg) { return fn_.fn(arg, c_); }
      };
  } // Second

  /**
   * Special case which adapts a <code>BinaryPredicate</code> to a <code>Predicate</code>.
   * If <code>p</code> is a <code>BinaryPredicate</code>, then <code>Bind.Second(p, C).test(arg)</code>
   * returns <code>p.test(arg, C)</code>.
   */
  static public Predicate Second(final BinaryPredicate p, final Object c)
  {
    return new Predicate() {
	private BinaryPredicate test_;
	private Object c_;
	{ test_ = p; c_ = c; }
	public boolean test(Object arg) { return test_.test(arg, c_); }
      };
  } // Second

  //////////////////////////////////////////
  private Bind() { }
} // Bind

