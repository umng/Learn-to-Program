import java.util.*;
import java.util.stream.*;

class TestReductionStream{
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);

    Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
    if(sum.isPresent())
      System.out.println("Sum: " + sum.get());

    Stream<Integer> stream = list.stream();
    stream.parallel();
    int sumOfEvenNos = stream.reduce(0, (a,b) -> {
      if(b%2 == 0)
        return a+b;
      return a;
    });
    System.out.println("Sum of Even Numbers: " + sumOfEvenNos);

    //parallel stream reduction
    int sumOfSqrtOfNos = list.parallelStream().reduce(0, (a,b) -> a+ (int)Math.sqrt(b), (a,b) -> a+b );
    System.out.println("Sum of squareroots of Numbers: " + sumOfSqrtOfNos);

  }
}
