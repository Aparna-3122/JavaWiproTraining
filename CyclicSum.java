import java.io.*;
import  java.util.*;

class CyclicSum {
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        String n=sc.nextLine();
	int sum = 0,i=0;
        
        for (i=0; i<n.length(); i++) {
            for (int j = i; j < n.length(); j++) {
                sum=sum+ Integer.parseInt(String.valueOf(n.charAt(j)));
            }
        }
        System.out.println(sum);
    }
}