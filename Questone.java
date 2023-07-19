import java.util.*;
class Questone
{
    public static String dectoNBase (int n, int num) 
    {
        String res = ""; 
	int i=0;
        int quotient;

	int arr[] = new int[10];
	arr[i]=num%n;
//System.out.print(arr[i]);
	i++;
        quotient=num / n;
        while(quotient != 0)
        {
            arr[i]=quotient % n;
	i++;
            quotient = quotient / n;
        }
     
        for (int j = 0; j < i; j++)
        {
            if (arr[j] > 9)
    	    {
                res = (char)(arr[j] - 9 + 64) + res;
            }
    	    else
                res = arr[j] + res;
        }
        return res;
    }
 
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int num = sc.nextInt ();
        System.out.println (dectoNBase (n, num));
    } 
}