package retrofit.serializer;

public class Serializer {
  public String[] serialize(Object obj) {
    return new String[] { String.valueOf(obj) };
  }
}
