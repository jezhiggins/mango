package uk.co.jezuk.mango;

/**
 * A <code>BinaryFunction</code> is some function taking two arguments -
 * <code>fn(x, y)</code>
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public interface BinaryFunction
{
  abstract public Object fn(Object x, Object y);

  /**
   * Adapts a <code>BinaryFunction</code> into a <code>UnaryFunction</code>.
   * If <code>f</code> an object implementing <code>BinaryFunction</code>, then
   * <code>BindFirst(f, C).fn(arg)</code> returns <code>f(C, arg)</code>.<p>
   * Intuitively, you can think of this as "binding" the first argument of a 
   * <code>BinaryFunction</code> to a constant, thus giving a <code>UnaryFunction</code>.
   */
  public class BindFirst implements UnaryFunction
  {
    public BindFirst(BinaryFunction f, Object c)
    {
      fn_ = f;
      c_ = c;
    } // BindFirst

    public Object fn(Object arg)
    {
      return fn_.fn(c_, arg);
    } // fn

    private BinaryFunction fn_;
    private Object c_;
  } // BindFirst

  /**
   * Adapts a <code>BinaryFunction</code> into a <code>UnaryFunction</code>.
   * If <code>f</code> an object implementing <code>BinaryFunction</code>, then
   * <code>BindSecond(f, C).fn(arg)</code> returns <code>f(arg, C)</code>.<p>
   * Intuitively, you can think of this as "binding" the second argument of a 
   * <code>BinaryFunction</code> to a constant, thus giving a <code>UnaryFunction</code>.
   */
  public class BindSecond implements UnaryFunction
  {
    public BindSecond(BinaryFunction f, Object c)
    {
      fn_ = f;
      c_ = c;
    } // BindSecond

    public Object fn(Object arg)
    {
      return fn_.fn(arg, c_);
    } // fn

    private BinaryFunction fn_;
    private Object c_;
  } // BindSecond
} // BinaryFunction

