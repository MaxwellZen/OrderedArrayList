import java.util.*;
import java.io.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int capacity) {
    super(capacity);
  }
  private int index(T element) {
    if (element==null) return 0;
    if (super.size()==0) return 0;
    if (element.compareTo(super.get(0))<0) return 0;
    int ans = 1;
    while (ans < super.size()-1 && element.compareTo(super.get(ans))>0) {
      ans++;
    }
    if (element.compareTo(super.get(super.size()-1))>0) return super.size();
    return ans;
  }
  public boolean add(T element) {
    int check = super.size();
    super.add(index(element), element);
    return super.size() == check+1;
  }
  public void add(int index, T element) {
    super.add(index(element), element);
  }
  public T set (int index, T element) {
    T ans = super.get(index);
    if (element != null) {
      super.remove(index);
    }
    super.add(index(element), element);
    return ans;
  }
}
