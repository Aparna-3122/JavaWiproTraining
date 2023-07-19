import java.io.*;
public class Employee implements Serializable
{
int id;
String name;
public Employee(int id, String name)
{
this.id=id;
this.name=name;
}
public static void main (String args[])
{
Employee s1= new Employee(12,"abc");
FileOutputStream fout = new FileOutputStream("f.txt");
ObjectOutputStream out= new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
out.close();
System.out.println("Serialization Done");
}
}




