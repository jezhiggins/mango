package uk.co.jezuk.mango;

/**
 * The Mango Library Iterator classes. 
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Iterators
{
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
   * @deprecated see {@link FilteredIterator}   
   */
  static public java.util.Iterator PredicatedIterator(java.util.Iterator iterator, Predicate predicate) { return FilteredIterator(iterator, predicate); }

  /**
   * A <code>FilteredIterator</code> enumerates only those elements of a collection
   * that match the supplied <code>Predicate</code>.
   * <p>
   * It takes a {@link Predicate} which encapsulates some test, and only 
   * returns those Objects in the sequence which pass the test.
   * <p>
   * Say you have a list of <code>String</code>s, myStringList and you're only 
   * interested in those that begin with 'S'. What you need is
   *
   * <pre>
Iterator iter = Mango.FilteredIterator(myStringList.iterator(), 
                                       new {@link Predicate}() {
                                           boolean test(Object o) {
                                             String s = (String)o;
                                             return s.charAt(0) == 'S';
                                           }
                                       });</pre>
   * <p>
   * A <code>FilteredIterator</code> implements the <code>java.util.Iterator</code> interface, 
   * and is constructed by wrapping around an existing iterator. 
   */
  static public java.util.Iterator FilteredIterator(java.util.Iterator iterator, Predicate predicate) { return new uk.co.jezuk.mango.iterators.FilteredIterator(iterator, predicate); }

  /**
   * A <code>SkippingIterator</code> enumerates a sequence,
   * stepping over the elements
   * that match the supplied <code>Predicate</code>.
   * <p>
   * Is it equivalent to <code>{@link FilteredIterator(iter, {@link predicates.Not}(predicate))</code>
   */ 
  static public java.util.Iterator SkippingIterator(java.util.Iterator iterator, Predicate predicate) { return new uk.co.jezuk.mango.iterators.SkippingIterator(iterator, predicate); }

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
     MyComplexObject mco = (MyComplexObject)Algorithms.find(
                                Iterators.TransformIterator(list.iterator(), 
                                                        Adapt.ArgumentMethod("GetName"),
                                theSearchName);
     if(mco != null) 
       ... found!
     else 
       ...
     </pre> 
   */ 
  static public java.util.Iterator TransformIterator(java.util.Iterator iterator, UnaryFunction transform) { return new uk.co.jezuk.mango.iterators.TransformIterator(iterator, transform); }

  //////////////////////////////////
  private Iterators() { }
} // Iterator
