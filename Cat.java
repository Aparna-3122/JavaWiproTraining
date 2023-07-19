import java.io.*;
public class Cat implements Serializable
{ 
public static void main(String[] args)
 {
Cat c = new Cat();
try {
FileOutputStream fs = new FileOutputStream("testSer.txt");
ObjectOutputStream os = new ObjectOutputStream(fs);
   os.writeObject(c);
os.close();
System.out.print("Serialization successful");
}
catch (Exception e)
{
e.printStackTrace();
}
try 
{
FileInputStream fis = new FileInputStream("testSer.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
c = (Cat) ois.readObject();
ois.close();   
} 
catch (Exception e) 
{
 e.printStackTrace(); }  
}
}