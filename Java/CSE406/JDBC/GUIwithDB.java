import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class GUIwithDB extends JFrame{
  private JTextField tfId, tfName, tfCourse, tfMarks;
  private JButton btnSave;
  public GUIwithDB(){
    Container cp = getContentPane();
    cp.setLayout(new GridLayout(5,2));

    add(new JLabel("Id: "));
    tfId = new JTextField(8);
    add(tfId);

    add(new JLabel("Name: "));
    tfName = new JTextField(20);
    add(tfName);

    add(new JLabel("Course: "));
    tfCourse = new JTextField(20);
    add(tfCourse);

    add(new JLabel("Marks: "));
    tfMarks = new JTextField(3);
    add(tfMarks);

    btnSave = new JButton("Save");
    add(btnSave);


    btnSave.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        int id = Integer.parseInt(tfId.getText().trim());
        String name = tfName.getText().trim();
        String course = tfCourse.getText().trim();
        int marks = Integer.parseInt(tfMarks.getText().trim());


        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mySqlDb","root","mkteq1mu");
          con.setAutoCommit(false);

          Statement stmt=con.createStatement();
          stmt.addBatch("insert into student values(" + id + ",'" + name + "');");
          stmt.addBatch("insert into academics values(" + id + ",'" + course + "'," + marks + ");");

          stmt.executeBatch();
          con.commit();
          con.close();
        }catch(Exception e){
          System.out.println(e);
        }
      }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Student Details");
    setSize(300,300);
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new GUIwithDB();
      }
    });
  }
}
