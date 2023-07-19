

import java.io.*;
    public class streams 
    {
        public static void main(String[] args)
        {
            try 
            {
	        FileOutputStream a = new FileOutputStream("serial");
	        ObjectOutputStream b = new ObjectOutputStream(a);
	        b.writeInt(5);
	        b.flush();
	        b.close();
	    }
	    catch(Exception e)
            {
	        System.out.println("Serialization" + e);
                System.exit(0);
            }
	    try
            {
	        int z;
	        FileInputStream c = new FileInputStream("serial");
	        ObjectInputStream d = new ObjectInputStream(c);
	        z = d.readInt();
	        d.close();
	        System.out.println(z);		    	
	    }
	    catch (Exception e) 
            {
                System.out.print("deserialization");
	        System.exit(0);
	    }
        }
    }
