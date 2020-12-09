import java.util.*;
import java.io.*
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList<T>() {
    super();
  }
  public NoNullArrayList<T> (int size) {
    super(size);
  }
  public T set (int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("cannot set elements to null");
    } else {
      return super.set(index, element);
    }
  }
  public boolean add (T element) {
    if (element==null) {
      throw new IllegalArgumentException("cannot add null elements");
    } else {
      return super.add(element);
    }
  }
  public void add (int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("cannot add null elements");
    } else {
      super.add(index, element);
    }
  }
}
