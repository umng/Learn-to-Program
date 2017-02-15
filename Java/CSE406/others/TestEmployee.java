import java.util.*;
import java.util.stream.*;

class Employee{
  private int uid;
  private String name;
  private int pay;

  public Employee(int uid, String name, int pay){
    this.uid = uid;
    this.name = name;
    this.pay = pay;
  }

  public int getUid(){
    return this.uid;
  }
  public String getName(){
    return this.name;
  }
  public int getPay(){
    return this.pay;
  }
}

class TestEmployee{
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    int n, uid, pay;
    String name;


    System.out.print("No. of Employees:");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();

    for (int i=0; i<n; i++) {
      System.out.print("Employee " + (i+1) + ":\n------------\nUID:");
      uid = scanner.nextInt();
      System.out.print("Name:");
      name = scanner.next();
      System.out.print("Pay:");
      pay = scanner.nextInt();

      employees.add(new Employee(uid, name, pay))
    }

    
  }
}
