package uk.co.jezuk.mango;

import uk.co.jezuk.mango.generators.*;

/**
 * The Mango Library Generators Library.
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class Generators
{
  /**
   * Returns Integer(seed), Integer(seed+1), Integer(seed+2) ... 
   * on successive calls to fn().
   * Sequence begins at 0 if no seed value is given.
   */
  static public Generator<Integer> IntegerSequence() { return new IntegerSequence(); }
  static public Generator<Integer> IntegerSequence(int seed) { return new IntegerSequence(seed); }
  static public Generator<Integer> IntegerSequence(Integer seed) { return new IntegerSequence(seed); }
} // class Generators
