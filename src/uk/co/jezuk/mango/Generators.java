package uk.co.jezuk.mango;

/**
 * The Mango Library Generators Library.
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 * @version $Id$
 */
public class Generators
{
  /**
   * Returns Integer(seed), Integer(seed+1), Integer(seed+2) ... on successive calls to fn()
   * Sequence begins at 0 if no seed value is given.
   */
  static public Generator IntegerSequence() { return new uk.co.jezuk.mango.generators.IntegerSequence(); }
  static Generator IntegerSequence(int seed) { return new uk.co.jezuk.mango.generators.IntegerSequence(seed); }
  static Generator IntegerSequence(Integer seed) { return new uk.co.jezuk.mango.generators.IntegerSequence(seed); }
} // class Generators
