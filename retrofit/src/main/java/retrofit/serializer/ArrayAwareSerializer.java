package retrofit.serializer;

/**
 * Serializer that recognizes arrays and emits a separate value for each element.
 */
public class ArrayAwareSerializer extends Serializer {
  @Override
  public String[] serialize(Object obj) {
    if (obj instanceof Object[]) {
      Object[] objs = (Object[]) obj;
      String[] rv = new String[objs.length];
      for (int i = 0; i < objs.length; i++) {
        rv[i] = super.serialize(objs[i])[0];
      }
      return rv;
    } else {
      return super.serialize(obj);
    }
  }
}
