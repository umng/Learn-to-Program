import java.util.*;

class TestArrayList{
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(20);
    al.add(40);
    al.add(2, 30);
    // System.out.println(al);

    ArrayList<Integer> al2 = new ArrayList<>(al);
    al2.addAll(al);
    al2.remove(3);
    System.out.println(al2.subList(0,3));
    // System.out.println(al2.get(al2.indexOf(40)));
    // System.out.println(al2.get(al2.lastIndexOf(30)));

    // ListIterator<Integer> li = al2.listIterator();
    // while(li.hasNext()){
    //   System.out.print(li.next() + "\t");
    // }

    // ListIterator<Integer> li = al2.listIterator(al2.size());
    // while(li.hasPrevious()){
    //   System.out.print(li.previous() + "\t");
    // }
  }
}
