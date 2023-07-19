import java.io.*;
import java.util.*;

class EncArray {
public static void main (String[]args) 
    {
	int len,i,sum;
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of the encoded array");
        len=sc.nextInt();
	int i1[]=new int[len];
	System.out.println("Enter the array elements");
	for(i=0;i<len;i++)
	i1[i]=sc.nextInt();
        int[] result = new int[len];
        result[len-1] = i1[len-1];

        for ( i = len - 1; i >= 1; i--) {
            result[i - 1] = i1[i - 1] - result[i];
        }

        System.out.println("Final array is");
	for(i=0;i<len;i++)
	{
	sum=sum+result[i];
	System.out.println(result[i]);
    }
	System.out.println(result[0],sum);
}