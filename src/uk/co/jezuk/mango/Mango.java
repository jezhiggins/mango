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
  static public void forEach(java.util.Collection collection, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(collection.iterator(), fn); }
  static public void forEach(java.util.Collection collection, int start, int end, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(BoundedIterator(collection.iterator(), start, end), fn); }
  static public void forEach(java.util.List list, int start, int end, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(BoundedIterator(list, start, end), fn); }
  static public void forEach(java.util.Iterator iterator, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(iterator, fn); } 
  
  static public int count(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(collection.iterator(), value); }
  static public int count(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public int count(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(BoundedIterator(list, start, end), value); }
  static public int count(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(iterator, value); } 
  
  static public int countIf(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(collection.iterator(), test); }
  static public int countIf(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(BoundedIterator(collection.iterator(), start, end), test); }
  static public int countIf(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(BoundedIterator(list, start, end), test); }
  static public int countIf(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(iterator, test); } 
  
  static public Object find(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(collection.iterator(), value); }
  static public Object find(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public Object find(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(BoundedIterator(list, start, end), value); }
  static public Object find(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(iterator, value); } 
  
  static public Object findIf(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(collection.iterator(), test); }
  static public Object findIf(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(BoundedIterator(collection.iterator(), start, end), test); }
  static public Object findIf(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(BoundedIterator(list, start, end), test); }
  static public Object findIf(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(iterator, test); } 

  //////////////////////////////////////////
  // Iterators
  static public java.util.Iterator BoundedIterator(java.util.Iterator iterator, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(iterator, start, end); }
  static public java.util.Iterator BoundedIterator(java.util.List list, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(list, start, end); }

  static public java.util.Iterator PredicatedIterator(java.util.Iterator iterator, Predicate predicate) { return new uk.co.jezuk.mango.iterators.PredicatedIterator(iterator, predicate); }

  /////////////////////////////////////////////////
  // Binary Predicates
  static public BinaryPredicate EqualTo() { return new uk.co.jezuk.mango.binarypredicates.EqualTo(); }
  static public BinaryPredicate GreaterThan() { return new uk.co.jezuk.mango.binarypredicates.GreaterThan(); }
  static public BinaryPredicate GreaterThanEquals() { return new uk.co.jezuk.mango.binarypredicates.GreaterThanEquals(); }
  static public BinaryPredicate LessThan() { return new uk.co.jezuk.mango.binarypredicates.LessThan(); }
  static public BinaryPredicate LessThanEquals() { return new uk.co.jezuk.mango.binarypredicates.LessThanEquals(); }
  static public BinaryPredicate NotEqualTo() { return new uk.co.jezuk.mango.binarypredicates.NotEqualTo(); }

  //////////////////////////////////
  private Mango() { }
} // Mango
