import java.sql.*;

class GetDriverInfo{
  public static void main(String args[]){
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mySqlDb","root","mkteq1mu");
      DatabaseMetaData dbmd=con.getMetaData();

      System.out.println("\n\n\nDriver Name:\t" + dbmd.getDriverName());
      System.out.println("Driver Version:\t" + dbmd.getDriverVersion());
      System.out.println("Database Product Name:\t" + dbmd.getDatabaseProductName());
      System.out.println("Database Product Version:\t" + dbmd.getDatabaseProductVersion());
      con.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
