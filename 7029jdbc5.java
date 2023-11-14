import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sonoo?useSSL=false","root","priya123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
System.out.println(stmt.executeUpdate("insert into emp2 values(1,'Sakshi',25)"));
System.out.println(stmt.executeUpdate("insert into emp2 values(2,'Ayush',28)"));
System.out.println(stmt.executeUpdate("insert into emp2 values(3,'Ashima',27)"));
System.out.println("row inserted");
System.out.println(stmt.executeUpdate("DELETE from emp2 where id =1"));
System.out.println("row deleted");
}catch(Exception e){ System.out.println(e);}  
}  
}  