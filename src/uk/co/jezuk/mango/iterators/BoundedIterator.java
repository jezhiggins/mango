package uk.co.jezuk.mango;

/**
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
class BoundedIterator implements java.util.Iterator
{
  BoundedIterator(java.util.Iterator iterator, int start, int end)
  {
    iter_ = new iteratorWrapper(iterator, start, end);
  } // BoundIterator
  
  BoundedIterator(java.util.List list, int start, int end)
  {
    iter_ = new listIterator(list, start, end);
  } // BoundedIterator

  public boolean hasNext()
  {
    return iter_.hasNext();
  } // hasNext

  public Object next()
  {
    return iter_.next();
  } // next

  public void remove()
  {
    iter_.remove();
  } // remove

  private java.util.Iterator iter_;

  ///////////////////////////////////////////////////
  static void checkConstraints(int start, int end)
  {
    if(start < 0)
      throw new IndexOutOfBoundsException("start < 0");
    if(end < 0)
      throw new IndexOutOfBoundsException("end < 0");
    if(start > end)
      throw new IndexOutOfBoundsException("start > end");
  } // checkConstraints

  static private class iteratorWrapper implements java.util.Iterator
  {
    iteratorWrapper(java.util.Iterator iterator, int start, int end)
    {
      BoundedIterator.checkConstraints(start, end);

      iter_ = iterator;
      for(index_ = 0; iter_.hasNext() && index_ < start; ++index_, iter_.next())
	;

      end_ = iter_.hasNext() ? end : index_;
    } // iteratorWrapper

    public boolean hasNext()
    {
      end_ = iter_.hasNext() ? end_ : index_;
      return (index_ < end_);
    } // hasNext()

    public Object next()
    {
      ++index_;
      return iter_.next();
    } // next

    public void remove()
    {
      iter_.remove();
    } // remove

    private java.util.Iterator iter_;
    private int index_;
    private int end_;
  } // iteratorWrapper

  static private class listIterator implements java.util.Iterator
  {
    listIterator(java.util.List list, int start, int end)
    {
      BoundedIterator.checkConstraints(start, end);

      list_ = list;
      index_ = start;
      end_ = end;

      if(end_ > list_.size())
	end_ = list.size();
    } // listIterator

    public boolean hasNext()
    {
      return (index_ < end_);
    } // hasNext

    public Object next()
    {
      return list_.get(index_++);
    } // next

    public void remove()
    {
      list_.remove(index_ - 1);
    } // remove

    private java.util.List list_;
    private int index_;
    private int end_;
  } // listIterator
} // BoundedIterator
