package uk.co.jezuk.mango;

/**
 * A <code>Triplet</code> holds three <code>Object</code>s.
 * @author Jez Higgins, Jez UK Ltd
 * @version $Id$
 */
public class Triplet
{
  public Triplet()
  {
    first = null;
    second = null;
    third = null;
  } // Triplet

  public Triplet(Object one, Object two, Object three)
  {
    first = one;
    second = two;
    third = three;
  } // Triplet

  public Object first;
  public Object second;
  public Object third;
} // class Triplet
