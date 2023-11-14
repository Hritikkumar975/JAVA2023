import java.sql.*;
class a
{
public static void main(String st[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
//query fire
PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?)");
ps.setInt(1,1);
ps.setString(2,"BCA");
ps.setString(3,"aaa");
ps.setInt(4,2023);

System.out.println(ps.executeUpdate());

}
catch(ClassNotFoundException e)
{
    System.out.println(e);
}
catch(SQLException e)
{
    System.out.println(e);
}
}
}