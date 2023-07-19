import java.io.*;
import  java.util.*;
class WeightOfString
{
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	System.out.println("Enter E for exclude or I for include");
	char ch=sc.next().charAt(0);
        int weight = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (ch == 'E') {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                    continue;
            }

            if (letter >= 65 && letter <= 90) weight += letter - 64;
            else if (letter >= 97 && letter <= 122) weight += letter - 96;      
 }
System.out.println(weight);
    }
}