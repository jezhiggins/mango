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
  static public void forEach(java.util.Collection collection, UnaryFunction fn) { ForEach.execute(collection.iterator(), fn); }
  static public void forEach(java.util.Collection collection, int start, int end, UnaryFunction fn) { ForEach.execute(BoundedIterator(collection.iterator(), start, end), fn); }
  static public void forEach(java.util.List list, int start, int end, UnaryFunction fn) { ForEach.execute(BoundedIterator(list, start, end), fn); }
  static public void forEach(java.util.Iterator iterator, UnaryFunction fn) { ForEach.execute(iterator, fn); } 
  
  static public int count(java.util.Collection collection, Object value) { return Count.execute(collection.iterator(), value); }
  static public int count(java.util.Collection collection, int start, int end, Object value) { return Count.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public int count(java.util.List list, int start, int end, Object value) { return Count.execute(BoundedIterator(list, start, end), value); }
  static public int count(java.util.Iterator iterator, Object value) { return Count.execute(iterator, value); } 
  
  static public int countIf(java.util.Collection collection, Predicate test) { return CountIf.execute(collection.iterator(), test); }
  static public int countIf(java.util.Collection collection, int start, int end, Predicate test) { return CountIf.execute(BoundedIterator(collection.iterator(), start, end), test); }
  static public int countIf(java.util.List list, int start, int end, Predicate test) { return CountIf.execute(BoundedIterator(list, start, end), test); }
  static public int countIf(java.util.Iterator iterator, Predicate test) { return CountIf.execute(iterator, test); } 
  
  static public Object find(java.util.Collection collection, Object value) { return Find.execute(collection.iterator(), value); }
  static public Object find(java.util.Collection collection, int start, int end, Object value) { return Find.execute(BoundedIterator(collection.iterator(), start, end), value); }
  static public Object find(java.util.List list, int start, int end, Object value) { return Find.execute(BoundedIterator(list, start, end), value); }
  static public Object find(java.util.Iterator iterator, Object value) { return Find.execute(iterator, value); } 
  
  static public Object findIf(java.util.Collection collection, Predicate test) { return FindIf.execute(collection.iterator(), test); }
  static public Object findIf(java.util.Collection collection, int start, int end, Predicate test) { return FindIf.execute(BoundedIterator(collection.iterator(), start, end), test); }
  static public Object findIf(java.util.List list, int start, int end, Predicate test) { return FindIf.execute(BoundedIterator(list, start, end), test); }
  static public Object findIf(java.util.Iterator iterator, Predicate test) { return FindIf.execute(iterator, test); } 

  //////////////////////////////////////////
  // Iterators
  static public java.util.Iterator BoundedIterator(java.util.Iterator iterator, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(iterator, start, end); }
  static public java.util.Iterator BoundedIterator(java.util.List list, int start, int end) { return new uk.co.jezuk.mango.iterators.BoundedIterator(list, start, end); }

  static public java.util.Iterator PredicatedIterator(java.util.Iterator iterator, Predicate predicate) { return new uk.co.jezuk.mango.iterators.PredicatedIterator(iterator, predicate); }

  //////////////////////////////////
  private Mango() { }
} // Mango
