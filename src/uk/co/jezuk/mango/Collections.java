package uk.co.jezuk.mango;

import java.util.Map;

import uk.co.jezuk.mango.collections.*;

/** 
 * The Mango Library Collections utilities
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class Collections
{
  static public interface MapBuilder<K,V> extends Map<K, V>
  {
    public MapBuilder<K, V> map(K key, V v);
  } // interface MapBuilder

  static public <K, V> MapBuilder<K,V> map(K key, V value)
  {
    return MapFactory.map(key, value);
  } // map

  private Collections() { }
} // Collections
