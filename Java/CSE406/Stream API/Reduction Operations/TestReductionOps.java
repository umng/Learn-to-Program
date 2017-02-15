import java.util.*;
import java.util.stream.*;

class Employee{
  int id, pay, score;

  public Employee(int id, int pay, int score){
    this.id = id;
    this.pay = pay;
    this.score = score;
  }

  public int getId(){
    return this.id;
  }
  public int getPay(){
    return this.pay;
  }
  public int getScore(){
    return this.score;
  }
}

class TestReductionOps{
  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1, 10000, 7));
    employees.add(new Employee(2, 15000, 4));
    employees.add(new Employee(3, 12000, 5));
    employees.add(new Employee(4, 26000, 9));
    employees.add(new Employee(5, 20000, 8));

    ArrayList<Integer> pays = new ArrayList<>();
    pays.add(20000);
    pays.add(35000);
    pays.add(40000);
    pays.add(10000);
    pays.add(18000);

    System.out.println("Count: " + employees.stream().count());

    Optional<Integer> averagePay = pays.stream().reduce( (a,b) -> (Integer)(a+b)/2);
    if(averagePay.isPresent())
      System.out.println("Average Pay: " + averagePay.get());

    // Optional<Integer> minScore = scores.stream().min(Integer::compare);
    // if(minScore.isPresent())
    //   System.out.println("min Score: " + minScore.get());


    // List<Employee> scores = employees.stream().filter(n -> n.getScore()).collect(Collectors.toList());
    // Optional<Integer> maxScore = scores.stream().max(Integer::compare);
    // if(maxScore.isPresent())
    //   System.out.println("max Score: " + maxScore.get());
  }
}
