import java.sql.*;

class BatchProcessingDemo{
  public static void main(String args[]){
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mySqlDb","root","mkteq1mu");
      con.setAutoCommit(false);

      Statement stmt = con.createStatement();
      int x = 10;
      while(x<100)
        stmt.addBatch("insert into t1 values(" + (x++) + ");");
        stmt.addBatch("insert into t1 values(" + (x++) + ");");
      stmt.executeBatch();

      con.commit();
      System.out.println("Changes made Successfully.");
      con.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
