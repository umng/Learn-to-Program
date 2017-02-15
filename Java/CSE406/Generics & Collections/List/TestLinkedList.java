import java.util.*;

class TestLinkedList{
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.addFirst(10);
    ll.addLast(50);
    ll.removeLast();
    System.out.println(ll);
  }
}
