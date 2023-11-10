// Program to insert, delete, update in table using PreparedStatement.
import java.sql.*;
import java.util.Scanner;

class Database{
    Connection c;
    PreparedStatement s;
    public Database(String url,String uname,String pass) throws SQLException,ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
         c=DriverManager.getConnection(url,uname,pass);
    }
     void insert() throws SQLException {
    s=c.prepareStatement("insert into student values(?,?)");
    s.setInt(1,7074);
    s.setString(2,"Ankush");
System.out.println(s.executeUpdate() +"Row affected");
   }
     void delete() throws SQLException {
        s=c.prepareStatement("delete from student where roll=?");
        s.setInt(1,7074);
System.out.println(s.executeUpdate() +"Row affected");
        }

     void update() throws SQLException {
       s=c.prepareStatement("update student set name=? where roll=?");
       s.setString(1,"Java");
       s.setInt(2,7074);
       System.out.println(s.executeUpdate() +"Row affected");
        }
}
class Db{
    public static void main(String str [])throws SQLException,ClassNotFoundException,java.io.IOException{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the MySql url to establish the connection : ");
        String url=s.nextLine();
        System.out.println("Enter the MySql User Name");
          String uname=s.nextLine();
        System.out.println("Enter the MySql Password");
          String pass=s.nextLine();
        Database d=new Database(url,uname,pass);
    int c;
     System.out.println(" Press 1 for insert. \n Press 2 for delete \n Press 3 for update \n Press 4 for Exit");
     Scanner sc=new Scanner(System.in);
     c=sc.nextInt();
    switch(c){
        case 1:
       d.insert();
        break;

        case 2:
        d.delete();
        break;

        case 3:
         d.update();
        break;
    case 4:
        System.out.println("Exit Successfully");
        break;
        default :
     System.out.println("Choose between 1-4");
        break;
    }
    }
}
