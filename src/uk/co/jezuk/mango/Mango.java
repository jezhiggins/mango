package uk.co.jezuk.mango;

/**
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Mango
{
  /////////////////////////
  // algorithms
  /**
   * The algorithm ForEach applies the function <code>fn</code> to
   * each element in the <code>iterator</code> sequence. 
   */
  static public void forEach(java.util.Collection collection, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(collection.iterator(), fn); }
  static public void forEach(java.util.Collection collection, int start, int end, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(BoundedIterator(collection.iterator(), start, end), fn); }
  static public void forEach(java.util.List list, int start, int end, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(BoundedIterator(list, start, end), fn); }
  static public void forEach(java.util.Iterator iterator, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(iterator, fn); } 
  /**
   * <code>Count</code> computes the number of elements in the sequence that 
   * are equal to <code>value</code>.  <br>
   * <code>value</code> may be <code>null</code>.<br>
   * The objects in the sequence and <code>value</code> must be comparable using
   * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
   */
  static public int count(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(collection.iterator(), value); }
  static public int count(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public int count(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(BoundedIterator(list, start, end), value); }
  static public int count(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(iterator, value); } 
  
  /**
   * <code>CountIf</code> is similar to <code>Count</code>, but more general.
   * It computes the number of elements in the sequence which satisfy some condition.  
   * The condition is a described in the user-supplied <code>test</code> object, and 
   * <code>CountIf</code> computes the number of objects such that <code>test.test(o)</code>
   * is <code>true</code>.
   */ 
  static public int countIf(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(collection.iterator(), test); }
  static public int countIf(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(BoundedIterator(collection.iterator(), start, end), test); }
  static public int countIf(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(BoundedIterator(list, start, end), test); }
  static public int countIf(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(iterator, test); } 
  
  /**
   * Searchs the sequence travesed by the Iterator for the given value.
   * Returns the <code>Object</code>, or <code>null</code> if the value
   * is not found.  The iterator will have been advanced to the next object 
   * in the sequence.
   * The objects in the sequence and <code>value</code> must be comparable using
   * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
   */
  static public Object find(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(collection.iterator(), value); }
  static public Object find(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public Object find(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(BoundedIterator(list, start, end), value); }
  static public Object find(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(iterator, value); } 
  
  /**
   * Searchs the sequence traversed by the Iterator and returns the first
   * object encountered for which the Predicate returns <code>true</code>.
   * Returns the <code>Object</code>, or <code>null</code> if the value
   * is not found.  The iterator will have been advanced to the next object 
   * in the sequence.
   */
  static public Object findIf(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(collection.iterator(), test); }
  static public Object findIf(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(BoundedIterator(collection.iterator(), start, end), test); }
  static public Object findIf(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(BoundedIterator(list, start, end), test); }
  static public Object findIf(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(iterator, test); } 

  /**
   * Removes objects equal to <code>value</code> from the sequence.
   */
  static public void remove(java.util.Collection collection, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(collection.iterator(), value); }
  static public void remove(java.util.Collection collection, int start, int end, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public void remove(java.util.List list, int start, int end, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(BoundedIterator(list, start, end), value); }
  static public void remove(java.util.Iterator iterator, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(iterator, value); } 
  
  /**
   * Removes objects which match <code>test</code> from the sequence.
   */
  static public void removeIf(java.util.Collection collection, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(collection.iterator(), pred); }
  static public void removeIf(java.util.Collection collection, int start, int end, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(BoundedIterator(collection.iterator(), start, end), pred); }
  static public void removeIf(java.util.List list, int start, int end, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(BoundedIterator(list, start, end), pred); }
  static public void removeIf(java.util.Iterator iterator, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(iterator, pred); } 
  
  //////////////////////////////////////////
  // Iterators
  /**
   * A <code>BoundedIterator</code> enumerates of a subset of a collection, in the
   * range [<code>start</code>, <code>end</code>).  A normal <code>java.util.Iterator</code> 
   * traverses [0, collection.size()), so BoundedIterator allows you
   * to pick out a sub-set without using <code>list.subList()</code> 
   * or equivalent.
   */
  static public java.util.Iterator BoundedIterator(java.util.Iterator iterator, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(iterator, start, end); }
  static public java.util.Iterator BoundedIterator(java.util.List list, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(list, start, end); }

  /**
   * A <code>PredicatedIterator</code> enumerates only those elements of a collection
   * that match the supplied <code>Predicate</code>.
   */
  static public java.util.Iterator PredicatedIterator(java.util.Iterator iterator, Predicate predicate) { return new uk.co.jezuk.mango.iterators.PredicatedIterator(iterator, predicate); }

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
   * <code>true</code> if <code>!(x.equals(y))</code>, <code>(x == null && y != null)</code> or <code>(x != null && y == null)</code>
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
