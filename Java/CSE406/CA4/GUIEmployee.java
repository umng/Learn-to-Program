import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.sql.*;
import java.util.*;

class GUIEmployee extends JFrame{
  private JTextField tfId, tfName, tfSalary;
  private JButton btnAdd, btnSave;

  int avrg = 0;
  LinkedList<Employee> employees = new LinkedList<Employee>();

  public GUIEmployee(){

    Container cp = getContentPane();
    cp.setLayout(new GridLayout(5,2));

    add(new JLabel("Id: "));
    tfId = new JTextField(8);
    add(tfId);

    add(new JLabel("Name: "));
    tfName = new JTextField(20);
    add(tfName);

    add(new JLabel("Salary: "));
    tfSalary = new JTextField(5);
    add(tfSalary);

    btnAdd = new JButton("Add");
    add(btnAdd);

    btnSave = new JButton("Save");
    add(btnSave);


    btnAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        int id = Integer.parseInt(tfId.getText().trim());
        String name = tfName.getText().trim();
        int salary = Integer.parseInt(tfSalary.getText().trim());

        employees.add(new Employee(id, name, salary));

        avrg = (avrg + salary) / 2;

        // Iterator itr = employees.iterator();
        // if(itr.hasNext())
        //   avrg = ((Employee) itr.next()).getSalary();
        // while(itr.hasNext()){
        //   Employee e = (Employee) itr.next();
        //   avrg = (avrg + ((Employee) itr.next()).getSalary()) / 2;
        // }
        System.out.println("Average Salary: " + avrg);

      }
    });


    btnSave.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {


      }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Employee");
    setSize(300,300);
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new GUIEmployee();
      }
    });
  }
}

class Employee {
  public int id, salary;
  public String name;
  public Employee(int id, String name, int salary) {
    this.id = id;
    this.name= name;
    this.salary = salary;
  }
  public int getSalary() {
    return this.salary;
  }
}
