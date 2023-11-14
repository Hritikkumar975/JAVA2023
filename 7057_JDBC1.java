import java.io.*;
import java.sql.*;
 
class GFG {
    public static void main(String[] args) throws Exception
    {
        String url
            = "jdbc:mysql://localhost:3306/table_name"; 
        String username = "rootgfg"; 
        String password = "gfg123";
        String query
            = "select *from students"; 
        Class.forName(
            "com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(
            url, username, password);
        System.out.println(
            "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs
            = st.executeQuery(query);
        rs.next();
        String name
            = rs.getString("name");
 
        System.out.println(name); 
        st.close(); 
        con.close(); 
        System.out.println("Connection Closed....");
    }
}