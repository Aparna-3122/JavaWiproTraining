import java.io.*;

public class SerialEg  implements java.io.Serializable {

  public String stu_Name,branch;
  public int stu_Id;

  public static void main(String[] args) {
    // Create a Student object.
    SerialEg std = new SerialEg();
    std.stu_Name = "George";
    std.branch = "CSE";
    std.stu_Id = 12;

    // To hold the deserialized byte-stream
    SerialEg deserializedvar;
    try {
      // Serializing the student object - std
      FileOutputStream fileOut = new FileOutputStream("D:/storeObject.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(std);
      out.close();
      // Serialization complete
      System.out.printf("Object serialized");

      // Deserialization process
      FileInputStream fileIn = new FileInputStream("D:/storeObject.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      
      //Deserialization
      deserializedvar = (SerialEg) in.readObject();
      in.close();
      fileIn.close();

      // Printing the deserialized object.
      System.out.println("Deserialized Student...");
      System.out.println("Name: " + std.stu_Name);
      System.out.println("Branch: " + std.branch);
    } catch (IOException i) {
      i.printStackTrace();
    } catch (Exception e) {
      System.out.println("Class not found");
      e.printStackTrace();
      return;
    }
  }
}
