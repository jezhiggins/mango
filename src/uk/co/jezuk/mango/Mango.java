package uk.co.jezuk.mango;

/**
 * The Mango Library. 
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Mango
{
  //////////////////////////////////////////
  // Iterators
  /**
   * A <code>BoundedIterator</code> enumerates of a subset of a collection, in the
   * range [<code>start</code>, <code>end</code>).  
   * <p>
   * A conventional <code>java.util.Iterator</code>, obtained by a call to say 
   * <code>java.util.List.iterator()</code>, travels the entire sequence of the
   * <code>java.util.Collection</code> it points to. It starts at the beginning 
   * and keeps on going until you hit the end or get bored.
   * <p>
   * A BoundedIterator enumerates of a subset of a collection, in the range [start, end) - 
   * a normal <code>java.util.Iterator</code> traverses [0, collection.size()). A 
   * <code>BoundedIterator</code> therefore allows you to pick out a sub-set without
   * using <code>list.subList()</code> or equivalent.
   */
  static public java.util.Iterator BoundedIterator(java.util.Iterator iterator, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(iterator, start, end); }
  static public java.util.Iterator BoundedIterator(java.util.List list, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(list, start, end); }

  /**
   * A <code>PredicatedIterator</code> enumerates only those elements of a collection
   * that match the supplied <code>Predicate</code>.
   * <p>
   * It takes a {@link Predicate} which encapsulates some test, and only 
   * returns those Objects in the sequence which pass the test.
   * <p>
   * Say you have a list of <code>String</code>s, myStringList and you're only 
   * interested in those that begin with 'S'. What you need is
   *
   * <pre>
Iterator iter = Mango.PredicatedIterator(myStringList.iterator(), 
                                       new {@link Predicate}() {
                                           boolean test(Object o) {
                                             String s = (String)o;
                                             return s.charAt(0) == 'S';
                                           }
                                       });</pre>
   * <p>
   * A <code>PredicatedIterator</code> implements the <code>java.util.Iterator</code> interface, 
   * and is constructed by wrapping around an existing iterator. 
   */
  static public java.util.Iterator PredicatedIterator(java.util.Iterator iterator, Predicate predicate) { return new uk.co.jezuk.mango.iterators.PredicatedIterator(iterator, predicate); }

  /** 
   * Iterates over an array of objects.
   * <p>
   * An <code>ArrayIterator</code> puts a <code>java.util.Iterator</code> face on an 
   * object array, allowing it be treated as you would a <code>java.util.Collection.</code>
   */
  static public java.util.Iterator ArrayIterator(Object[] array) { return new uk.co.jezuk.mango.iterators.ArrayIterator(array); }

  /** 
   * Iterates over a single object.
   * <p>
   * Usually an iterator moves over some sequence. A <code>SingletonIterator</code> treats a 
   * single object as it if it were a list containing one object. Since <code>SingletonIterator</code>
   * implements the <code>java.util.Iterator</code> interface, it provides a convienent way of
   * passing a single object to an algorithm or other iterator consumer.
   */
  static public java.util.Iterator SingletonIterator(Object object) { return new uk.co.jezuk.mango.iterators.SingletonIterator(object); }

  /**
   * A <code>TransfromIterator</code> applies a <code>{@link UnaryFunction}</code> to 
   * each element in the sequence, returning the the function result at each step.
   * <p>
   * Say you have a list of some complex type, and you want to find on by name.
   * You could (caution! trivial example follows)
   * <pre>
     Iterator i = list.iterator();
     while(i.hasNext()) {
       MyComplexObject mco = (MyComplexObject)i.next();
       if(mco.GetName().equals(theSearchName)) 
         .. do something
     }
     // did I find it or not - do the right thing here
     </pre>
   * or you could
   * <pre>
     MyComplexObject mco = (MyComplexObject)Mango.find(
                                Mango.TransformIterator(list.iterator(), 
                                                        Adapt.ArgumentMethod("GetName"),
                                theSearchName);
     if(mco != null) 
       ... found!
     else 
       ...
     </pre> 
   */ 
  static public java.util.Iterator TransformIterator(java.util.Iterator iterator, UnaryFunction transform) { return new uk.co.jezuk.mango.iterators.TransformIterator(iterator, transform); }

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
  private Mango() { }
} // Mango
