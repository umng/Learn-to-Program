import java.sql.*;
class MysqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mySqlDb","root","mkteq1mu");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from t1");
while(rs.next())
System.out.println(rs.getInt(1));
con.close();
}catch(Exception e){ System.out.println(e);}
}
}
