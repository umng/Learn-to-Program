import java.util.*;
import java.util.stream.*;

class Employee{
  String name;
  int pay;

  public Employee(String name, int pay){
    this.name = name;
    this.pay = pay
  }
}

class EmployeePay{
  int pay;

  public EmployeePay(int pay){
    this.pay = pay;
  }
}

class StreamMapping{
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Satish", 50000));
    employees.add(new Employee("Umang", 10000));
    employees.add(new Employee("Sagar", 35000));
    employees.add(new Employee("Rishabh", 50000));
    employees.add(new Employee("Nikunj", 30000));

    Stream<EmployeePay> employeePays = list.stream().map( (a) -> )
  }
}
