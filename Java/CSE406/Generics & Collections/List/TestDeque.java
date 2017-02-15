import java.util.*;

class TestDeque{
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();
    //  REMOVAL FROM EMPTY LIST RETURNS "NULL"  //
    dq.pollLast();
    System.out.println(dq.peekFirst());

    dq.offer(20);
    dq.offer(0);
    dq.offer(30);
    // dq.offerFirst(10);
    // dq.offerLast(30);
    // dq.offerLast(40);
    // dq.pollFirst();
    // dq.pollLast();
    dq.poll();
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());
    // dq.pollLast();
    // System.out.println(dq.pollLast());
    // System.out.println(dq.peekLast());
  }
}
