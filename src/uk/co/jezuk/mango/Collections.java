package uk.co.jezuk.mango;

import java.util.Map;

import uk.co.jezuk.mango.collections.*;

/** 
 * <strong>The Mango Library Collection Utilities</strong>
 *
 * @author Jez Higgins, jez@jezuk.co.uk
 */
public class Collections
{

  static public interface MapBuilder<K,V> extends Map<K, V>
  {
    public MapBuilder<K, V> map(K key, V v);
  } // interface MapBuilder

  /**
   * MapBuilder provides a way to initialise maps directly. <br/>
   * <code>Map&lt;String, String&gt; map = Collections.map("fish", "bicycle")<br/>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; .map("croup", "throat")<br/>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; .map("monkey", "nuts");</code><br/>
   * is some what more concise that <br/>
   * <code>Map&lt;String, String&gt; map = new HashMap&lt;String, String&gt;<br/>
   * map.put("fish", "bicycle");<br/>
   * map.put("croup", "throat");<br/>
   * map.put("monkey", "nuts");<br/>
   */
  static public <K, V> MapBuilder<K,V> map(K key, V value)
  {
    return MapFactory.map(key, value);
  } // map

  private Collections() { }
} // Collections
