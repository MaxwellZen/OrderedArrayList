import java.util.*;
import java.io.*;
public class OrderedArrayList<T> implements Comparable<T> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int capacity) {
    super(capacity);
  }
  private int index(T element) {
    int ans = 0;
    while (element.compareTo(super.get(ans))<0) {
      ans += 1;
    }
    return ans;
  }
  public boolean add(T element) {
    super.add(index(element), element);
  }
  public void add(int index, T element) {
    super.add(index(element), element);
  }
  public T set (int index, T element) {
    super.remove(index);
    super.add(index(element), element);
  }
}
