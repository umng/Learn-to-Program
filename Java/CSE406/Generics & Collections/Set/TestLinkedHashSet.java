import java.util.*;

class TestLinkedHashSet{
  public static void main(String[] args) {
    LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
    lhs1.add("Sagar");
    lhs1.add("Umang");
    System.out.println(lhs1);

    LinkedHashSet<String> lhs2 = new LinkedHashSet<>(lhs1);
    lhs2.add("Ruchik");
    lhs2.add("Mukesh");
    // lhs2.addAll(lhs1);
    // lhs2.clear();
    System.out.println(lhs2);
    System.out.println(lhs2.contains("Saga"));
    System.out.println(lhs2.containsAll(lhs1));
    System.out.println(lhs2.equals(lhs1));
    System.out.println(lhs2.hashCode());
    System.out.println(lhs2.isEmpty());
    // System.out.println(lhs2.remove("Mukesh"));
    // System.out.println(lhs2);
    // System.out.println(lhs2.removeAll(lhs1));
    // System.out.println(lhs2);
    System.out.println(lhs2.retainAll(lhs1));
    System.out.println(lhs2);
    System.out.println(lhs2.size());

    // Object sa[] = lhs2.toArray();
    // for(Object s : sa){
    //   System.out.println(s);
    // }

    Iterator<String> i = lhs1.iterator();
    while(i.hasNext()){
      System.out.print(i.next() + ",\t");
    }

  }
}
