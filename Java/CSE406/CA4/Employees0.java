import java.sql.*;
import java.util.*;

class Employees0{
  public static void main(String args[]){
    List<Employee> employees = new LinkedList<Employee>();

    employees.add(new Employee(1, "A", 1000));
    employees.add(new Employee(2, "B", 2000));
    employees.add(new Employee(3, "C", 3000));

    int avrg = 0;
    Iterator itr = employees.iterator();
    if(itr.hasNext())
      avrg = ((Employee) itr.next()).getSalary();
    while(itr.hasNext()){
      Employee e = (Employee) itr.next();
      avrg = (avrg + ((Employee) itr.next()).getSalary()) / 2;
    }
    System.out.println("Average Salary: " + avrg);

    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","root");
      con.setAutoCommit(false);

      Statement stmt=con.createStatement();
      stmt.addBatch("insert into salary values(" + avrg + ");");

      stmt.executeBatch();
      con.commit();
      con.close();
      System.out.println("Average Salary saved to database ");
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
