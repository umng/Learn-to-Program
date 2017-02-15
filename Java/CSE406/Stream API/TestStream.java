import java.util.*;
import java.util.stream.*;

public class TestStream{
  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(5);
    myList.add(50);
    myList.add(12);
    myList.add(9);
    myList.add(24);
    myList.add(31);
    myList.add(25);
    myList.add(29);
    myList.add(3);
    System.out.println(myList);

    // Stream<Integer> s1 = myList.stream().filter(n -> (n%2)==1).filter(n -> n>10);
    //
    // ArrayList<Integer> outList = new ArrayList<>();
    // s1.forEach(n -> outList.add(n));
    // System.out.println(outList);

    // System.out.println("Count:\t" + myList.stream().count());

    int sum = myList.stream().mapToInt(n -> n.intValue()).sum();
    System.out.println(sum);
  }
}
