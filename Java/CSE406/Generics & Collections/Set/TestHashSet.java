import java.util.*;

class TestHashSet{
  public static void main(String[] args) {
    HashSet<String> hs1 = new HashSet<>();
    hs1.add("Sagar");
    hs1.add("Umang");
    System.out.println(hs1);

    HashSet<String> hs2 = new HashSet<>();
    hs2.add("Ruchik");
    hs2.add("Mukesh");
    // hs2.addAll(hs1);
    // hs2.clear();
    System.out.println(hs2);
    System.out.println(hs2.contains("Saga"));
    System.out.println(hs2.containsAll(hs1));
    System.out.println(hs2.equals(hs1));
    System.out.println(hs2.hashCode());
    System.out.println(hs2.isEmpty());
    // System.out.println(hs2.remove("Mukesh"));
    // System.out.println(hs2);
    // System.out.println(hs2.removeAll(hs1));
    // System.out.println(hs2);
    System.out.println(hs2.retainAll(hs1));
    System.out.println(hs2);
    System.out.println(hs2.size());

    // Object sa[] = hs2.toArray();
    // for(Object s : sa){
    //   System.out.println(s);
    // }

    Iterator<String> i = hs1.iterator();
    while(i.hasNext()){
      System.out.print(i.next() + ",\t");
    }

  }
}
