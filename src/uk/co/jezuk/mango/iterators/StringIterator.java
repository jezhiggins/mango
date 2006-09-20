package uk.co.jezuk.mango.iterators;

/**
 *
 * @author  jez@jezuk.co.uk
 */
public class StringIterator implements java.util.Iterator
{
	public StringIterator(String s)
	{
		s_ = s;
		if((s_ != null) && (s_.length() > 0))
			pos_ = 0;
	} // StringIterator

  public boolean hasNext()
  {
    return (pos_ != -1);
  } // hasNext
  
  public Object next()
  {
		char c = s_.charAt(pos_++);
		if(pos_ == s_.length())
			pos_ = -1;
		return new Character(c);
  } // next
  
  public void remove()
  {
    throw new UnsupportedOperationException("uk.co.jezuk.mango.StringIterator does not support the remove method.  In fact it's probably a logic error that you called it at all.  Strings are immutable");
  } // remove

	private String s_;
	private int pos_ = -1;
} // StringIterator
