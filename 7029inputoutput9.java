
import java.io.*;

class filerd{
public static void main(String[] args) throws Exception
{File file = new File("read.txt");
BufferedReader br= new BufferedReader(new FileReader(file));
String st;
while ((st = br.readLine()) != null)
System.out.println(st);
}
}
