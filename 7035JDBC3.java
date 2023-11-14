import java.sql.*;

class employee{
public static void main(String s[]){

try{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bca4?useSSL=false","root","yash123");

Statement s1=con.createStatement();
int x= s1.executeUpdate("insert into employee values(1101,'remo',30000)");
if(x==1){
System.out.println("Row inserted successfully");}
}catch(ClassNotFoundException e){System.out.println(e);}
catch(SQLException e){System.out.println(e);}
}}