package uk.co.jezuk.mango;

/**
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Mango
{
  static public void forEach(java.util.Collection collection, UnaryFunction fn) { ForEach.execute(collection.iterator(), fn); }
  static public void forEach(java.util.Collection collection, int start, int end, UnaryFunction fn) { ForEach.execute(new BoundedIterator(collection.iterator(), start, end), fn); }
  static public void forEach(java.util.List list, int start, int end, UnaryFunction fn) { ForEach.execute(new BoundedIterator(list, start, end), fn); }
  static public void forEach(java.util.Iterator iterator, UnaryFunction fn) { ForEach.execute(iterator, fn); } 
  
  static public int count(java.util.Collection collection, Object value) { return Count.execute(collection.iterator(), value); }
  static public int count(java.util.Collection collection, int start, int end, Object value) { return Count.execute(new BoundedIterator(collection.iterator(), start, end), value); }
  static public int count(java.util.List list, int start, int end, Object value) { return Count.execute(new BoundedIterator(list, start, end), value); }
  static public int count(java.util.Iterator iterator, Object value) { return Count.execute(iterator, value); } 
  
  static public int countIf(java.util.Collection collection, Predicate test) { return CountIf.execute(collection.iterator(), test); }
  static public int countIf(java.util.Collection collection, int start, int end, Predicate test) { return CountIf.execute(new BoundedIterator(collection.iterator(), start, end), test); }
  static public int countIf(java.util.List list, int start, int end, Predicate test) { return CountIf.execute(new BoundedIterator(list, start, end), test); }
  static public int countIf(java.util.Iterator iterator, Predicate test) { return CountIf.execute(iterator, test); } 
  
  static public Object find(java.util.Collection collection, Object value) { return Find.execute(collection.iterator(), value); }
  static public Object find(java.util.Collection collection, int start, int end, Object value) { return Find.execute(new BoundedIterator(collection.iterator(), start, end), value); }
  static public Object find(java.util.List list, int start, int end, Object value) { return Find.execute(new BoundedIterator(list, start, end), value); }
  static public Object find(java.util.Iterator iterator, Object value) { return Find.execute(iterator, value); } 
  
  static public Object findIf(java.util.Collection collection, Predicate test) { return FindIf.execute(collection.iterator(), test); }
  static public Object findIf(java.util.Collection collection, int start, int end, Predicate test) { return FindIf.execute(new BoundedIterator(collection.iterator(), start, end), test); }
  static public Object findIf(java.util.List list, int start, int end, Predicate test) { return FindIf.execute(new BoundedIterator(list, start, end), test); }
  static public Object findIf(java.util.Iterator iterator, Predicate test) { return FindIf.execute(iterator, test); } 
   //////////////////////////////////
  private Mango() { }
} // Mango
