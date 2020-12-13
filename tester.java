import java.util.*;
import java.io.*;
public class tester {
  public static void main (String[] args) {
    System.out.println("testing nonullarraylist:");
    NoNullArrayList<Integer> test1 = new NoNullArrayList<Integer>();
    NoNullArrayList<Integer> test2 = new NoNullArrayList<Integer>(50);
    try {
      test1.add(5);
      test1.add(10);
      test1.add(2);
      test1.add(null);
      test1.add(3);
    } catch (IllegalArgumentException e){
      System.out.println("Correct error handling");
      for (Integer i : test1) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    try {
      test2.add(0, 5);
      test2.add(1, 10);
      test2.add(0, 2);
      test2.add(1, null);
      test2.add(1, 3);
    } catch (IllegalArgumentException e) {
      System.out.println("Correct error handling");
      for (Integer i : test2) {
        System.out.print(i+" ");
      }
    }
    System.out.println();
    OrderedArrayList<Integer> test = new OrderedArrayList<Integer>();
    for (Integer i = 0; i < 10; i += 2) {
      test.add(i);
    }
    for (Integer i = 1; i < 10; i += 2) {
      test.add (5, i);
    }
    for (int i = 0; i < test.size(); i++) {
      System.out.print(test.get(i) + " ");
    }
    System.out.println();
    for (int i = 0; i < 10; i += 2) {
      test.set(i, test.get(i)+10);
    }
    for (int i = 0; i < test.size(); i++) {
      System.out.print(test.get(i) + " ");
    }
    System.out.println();
    
  }
}
