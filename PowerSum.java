import java.io.*;
import  java.util.*;

class PowerSum {
public static void main (String[]args) 
    {	
        Scanner sc = new Scanner (System.in);
	int i1 = sc.nextInt ();
	int sum = 0,i;
        if (i1 < 10) 
	System.out.println("0");
        String n = String.valueOf(i1);
        
        for (i = 0;i<n.length(); i++){
            if (i == n.length()-1)
	    {
                sum=sum+ 1;
            }
	else
	    {
                sum=sum+(int)(Math.pow(Integer.parseInt(String.valueOf(n.charAt(i))),
                        Integer.parseInt(String.valueOf(n.charAt(i + 1)))));
            }
}
        System.out.println(sum);
    }
}