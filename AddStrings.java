import java.io.*;
import  java.util.*;
import java.math.BigDecimal;

class AddStrings
{
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number");
	String str=sc.nextLine();
	System.out.println("Enter a number");
	String str1=sc.nextLine();
        BigDecimal a = new BigDecimal(str);
        BigDecimal b = new BigDecimal(str1);
        str= String.valueOf(a.add(b));
	System.out.println(str);
    }
}