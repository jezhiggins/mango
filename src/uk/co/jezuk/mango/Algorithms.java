package uk.co.jezuk.mango;

/**
 * The Mango Algorithms Library.
 * 
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Algorithms
{
	/**
   * Algorithm intersection finds the common elements in both collections
	 * See http://en.wikipedia.org/wiki/Intersection_(set_theory)
	 */
	static public java.util.Collection intersection(java.util.Collection coll1, java.util.Collection coll2, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Intersection.execute(coll1.iterator(), coll2, results); }
	static public java.util.Collection intersection(java.util.Iterator iter1, java.util.Collection coll2, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Intersection.execute(iter1, coll2, results); }
	static public java.util.Collection intersection(java.util.Iterator iter1, java.util.Iterator iter2, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Intersection.execute(iter1, iter2, results); }

	/**
   * Algorithm symmetricDifference returns the elements that are on coll1 
	 * and not in coll2, and those elements in coll2 that are not in coll1.
	 * See http://en.wikipedia.org/wiki/Symmetric_difference
	 */
	static public java.util.Collection symmetricDifference(java.util.Collection coll1, java.util.Collection coll2, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.SymmetricDifference.execute(coll1.iterator(), coll2, results); }
	static public java.util.Collection symmetricDifference(java.util.Iterator iter1, java.util.Collection coll2, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.SymmetricDifference.execute(iter1, coll2, results); }
	static public java.util.Collection symmetricDifference(java.util.Iterator iter1, java.util.Iterator iter2, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.SymmetricDifference.execute(iter1, iter2, results); }


  /**
   * The algorithm ForEach applies the function <code>fn</code> to
   * each element in the <code>iterator</code> sequence. 
   */
  static public void forEach(java.util.Collection collection, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(collection.iterator(), fn); }
  static public void forEach(java.util.Collection collection, int start, int end, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(Iterators.BoundedIterator(collection.iterator(), start, end), fn); }
  static public void forEach(java.util.List list, int start, int end, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(Iterators.BoundedIterator(list, start, end), fn); }
  static public void forEach(java.util.Iterator iterator, UnaryFunction fn) { uk.co.jezuk.mango.algorithms.ForEach.execute(iterator, fn); } 

  /**
   * The algorithm Transform applies the function <code>fn</code> to
   * each element in the <code>iterator</code> sequence.
   * The return value of <code>fn</code> is added to the <code>results</code>
   * collection.  If the return value of <code>fn</code> is itself a
   * collection, then each member of that collection is added to 
   * <code>results</code>.
   */
  static public java.util.Collection transform(java.util.Collection collection, UnaryFunction fn, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Transform.execute(collection.iterator(), fn, results); }
  static public java.util.Collection transform(java.util.Collection collection, int start, int end, UnaryFunction fn, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Transform.execute(Iterators.BoundedIterator(collection.iterator(), start, end), fn, results); }
  static public java.util.Collection transform(java.util.List list, int start, int end, UnaryFunction fn, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Transform.execute(Iterators.BoundedIterator(list, start, end), fn, results); }
  static public java.util.Collection transform(java.util.Iterator iterator, UnaryFunction fn, java.util.Collection results) { return uk.co.jezuk.mango.algorithms.Transform.execute(iterator, fn, results); } 

  /**
   * <code>Count</code> computes the number of elements in the sequence that 
   * are equal to <code>value</code>.  <br>
   * <code>value</code> may be <code>null</code>.<br>
   * The objects in the sequence and <code>value</code> must be comparable using
   * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
   */
  static public int count(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(collection.iterator(), value); }
  static public int count(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(Iterators.BoundedIterator(collection.iterator(), start, end), value); }
  static public int count(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(Iterators.BoundedIterator(list, start, end), value); }
  static public int count(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.Count.execute(iterator, value); } 
  
  /**
   * <code>CountIf</code> is similar to <code>Count</code>, but more general.
   * It computes the number of elements in the sequence which satisfy some condition.  
   * The condition is a described in the user-supplied <code>test</code> object, and 
   * <code>CountIf</code> computes the number of objects such that <code>test.test(o)</code>
   * is <code>true</code>.
   */ 
  static public int countIf(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(collection.iterator(), test); }
  static public int countIf(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(Iterators.BoundedIterator(collection.iterator(), start, end), test); }
  static public int countIf(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(Iterators.BoundedIterator(list, start, end), test); }
  static public int countIf(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIf.execute(iterator, test); } 
  
  /**
   * <code>CountIfNot</code> is the complement of <code>CountIf</code>.
   * It counts the number of elements in the sequence which fail some condition.  
   * The condition is a described in the user-supplied <code>test</code> object, and 
   * <code>CountIfNot</code> computes the number of objects such that <code>test.test(o)</code>
   * is <code>false</code>.
   */ 
  static public int countIfNot(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIfNot.execute(collection.iterator(), test); }
  static public int countIfNot(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIfNot.execute(Iterators.BoundedIterator(collection.iterator(), start, end), test); }
  static public int countIfNot(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIfNot.execute(Iterators.BoundedIterator(list, start, end), test); }
  static public int countIfNot(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.CountIfNot.execute(iterator, test); } 
  
  /**
   * Searchs the sequence travesed by the Iterator for the given value.
   * Returns the <code>Object</code>, or <code>null</code> if the value
   * is not found.  The iterator will have been advanced to the next object 
   * in the sequence.
   * The objects in the sequence and <code>value</code> must be comparable using
   * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
   */
  static public Object find(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(collection.iterator(), value); }
  static public Object find(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(Iterators.BoundedIterator(collection.iterator(), start, end), value); }
  static public Object find(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(Iterators.BoundedIterator(list, start, end), value); }
  static public Object find(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.Find.execute(iterator, value); } 
  
  /**
   * Searchs the sequence travesed by the Iterator for the given value.
   * Returns the index of the value in the collection, or <code>-1</code>
	 * if the value is not found.  The iterator will have been advanced to 
	 * the next object in the sequence.
   * The objects in the sequence and <code>value</code> must be comparable using
   * <code>Object.equals</code> (unless <code>value</code> is <code>null</code>).
   */
  static public int findPosition(java.util.Collection collection, Object value) { return uk.co.jezuk.mango.algorithms.FindPosition.execute(collection.iterator(), value); }
  static public int findPosition(java.util.Collection collection, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.FindPosition.execute(Iterators.BoundedIterator(collection.iterator(), start, end), value); }
  static public int findPosition(java.util.List list, int start, int end, Object value) { return uk.co.jezuk.mango.algorithms.FindPosition.execute(Iterators.BoundedIterator(list, start, end), value); }
  static public int findPosition(java.util.Iterator iterator, Object value) { return uk.co.jezuk.mango.algorithms.FindPosition.execute(iterator, value); } 
  
  /**
   * Searchs the sequence traversed by the Iterator and returns the first
   * object encountered for which the Predicate returns <code>true</code>.
   * Returns the <code>Object</code>, or <code>null</code> if the value
   * is not found.  The iterator will have been advanced to the next object 
   * in the sequence.
   */
  static public Object findIf(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(collection.iterator(), test); }
  static public Object findIf(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(Iterators.BoundedIterator(collection.iterator(), start, end), test); }
  static public Object findIf(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(Iterators.BoundedIterator(list, start, end), test); }
  static public Object findIf(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIf.execute(iterator, test); } 

  /**
   * Searchs the sequence traversed by the Iterator and returns the first
   * object encountered for which the Predicate returns <code>false</code>.
   * The iterator will have been advanced to the next object 
   * in the sequence.
   */
  static public Object findIfNot(java.util.Collection collection, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIfNot.execute(collection.iterator(), test); }
  static public Object findIfNot(java.util.Collection collection, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIfNot.execute(Iterators.BoundedIterator(collection.iterator(), start, end), test); }
  static public Object findIfNot(java.util.List list, int start, int end, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIfNot.execute(Iterators.BoundedIterator(list, start, end), test); }
  static public Object findIfNot(java.util.Iterator iterator, Predicate test) { return uk.co.jezuk.mango.algorithms.FindIfNot.execute(iterator, test); } 

  /**
   * Removes objects equal to <code>value</code> from the sequence.
   */
  static public void remove(java.util.Collection collection, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(collection.iterator(), value); }
  static public void remove(java.util.Collection collection, int start, int end, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(Iterators.BoundedIterator(collection.iterator(), start, end), value); }
  static public void remove(java.util.List list, int start, int end, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(Iterators.BoundedIterator(list, start, end), value); }
  static public void remove(java.util.Iterator iterator, Object value) { uk.co.jezuk.mango.algorithms.Remove.execute(iterator, value); } 
  
  /**
   * Removes objects which match <code>test</code> from the sequence.
   */
  static public void removeIf(java.util.Collection collection, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(collection.iterator(), pred); }
  static public void removeIf(java.util.Collection collection, int start, int end, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(Iterators.BoundedIterator(collection.iterator(), start, end), pred); }
  static public void removeIf(java.util.List list, int start, int end, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(Iterators.BoundedIterator(list, start, end), pred); }
  static public void removeIf(java.util.Iterator iterator, Predicate pred) { uk.co.jezuk.mango.algorithms.RemoveIf.execute(iterator, pred); } 
 
 /**
   * Removes objects which match <code>test</code> from the sequence.
	 * Removed objects are appended to <code>removed</code> Collection.  Returns <code>removed<code>.
   */
  static public java.util.Collection removeIf(java.util.Collection collection, Predicate pred, java.util.Collection removed) { return uk.co.jezuk.mango.algorithms.RemoveIf.execute(collection.iterator(), pred, removed); }
  static public java.util.Collection removeIf(java.util.Collection collection, int start, int end, Predicate pred, java.util.Collection removed) { return uk.co.jezuk.mango.algorithms.RemoveIf.execute(Iterators.BoundedIterator(collection.iterator(), start, end), pred, removed); }
  static public java.util.Collection removeIf(java.util.List list, int start, int end, Predicate pred, java.util.Collection removed) { return uk.co.jezuk.mango.algorithms.RemoveIf.execute(Iterators.BoundedIterator(list, start, end), pred, removed); }
  static public java.util.Collection removeIf(java.util.Iterator iterator, Predicate pred, java.util.Collection removed) { return uk.co.jezuk.mango.algorithms.RemoveIf.execute(iterator, pred, removed); } 

  /**
   * Removes duplicate elements.  Whenever a consecutive groups of duplicate objects
   * occur in the sequence, <code>unique</code> removes all but the first objects
   * in each group.
   * <code>iterator</code> must support the <code>remove</code> method.
   * @see java.util.Iterator
   * @see java.util.Comparator
   */
	static public void unique(java.util.Collection collection) { uk.co.jezuk.mango.algorithms.Unique.execute(collection.iterator(), null);	} 
	static public void unique(java.util.Collection collection, int start, int end) { uk.co.jezuk.mango.algorithms.Unique.execute(Iterators.BoundedIterator(collection.iterator(), start, end), null);	} 
	static public void unique(java.util.List list, int start, int end) { uk.co.jezuk.mango.algorithms.Unique.execute(Iterators.BoundedIterator(list, start, end), null);	} 
	static public void unique(java.util.Iterator iterator) { uk.co.jezuk.mango.algorithms.Unique.execute(iterator, null);	} 
	static public void unique(java.util.Collection collection, java.util.Comparator comparator) { uk.co.jezuk.mango.algorithms.Unique.execute(collection.iterator(), comparator);	} 
	static public void unique(java.util.Collection collection, int start, int end, java.util.Comparator comparator) { uk.co.jezuk.mango.algorithms.Unique.execute(Iterators.BoundedIterator(collection.iterator(), start, end), comparator);	} 
	static public void unique(java.util.List list, int start, int end, java.util.Comparator comparator) { uk.co.jezuk.mango.algorithms.Unique.execute(Iterators.BoundedIterator(list, start, end), comparator);	} 
	static public void unique(java.util.Iterator iterator, java.util.Comparator comparator) { uk.co.jezuk.mango.algorithms.Unique.execute(iterator, comparator);	} 
  
  private Algorithms() { } // prevent instantiation
} // public class Algorithms
