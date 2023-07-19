import java.io.*;
import java.util.*;
public class SumOfNonPrimeIndexes {
    public static int sumOfNonPrime(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++)
            if (!isPrime(i))
                sum += input1[i];
        return sum;
    }

    public static boolean isPrime(int input1) {
        if (1 == input1 || 0 == input1)
            return false;
        for (int i = 2; i < input1; i++) {
            if (input1 % i == 0) {
                return false;
            }
        }
        return true;
    }
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
        System.out.println (sumOfNonPrime(i1,len));
    } 
}
