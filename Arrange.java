
import java.util.*;
public class Arrange
{
    public static int Freq(int n) {
    
        int [] frequency = new int[10];
        Arrays.fill(frequency,0);
	int l=0,i=0,j=0;
       while(n!=0)
	{
		
                int digit = n % 10;
                frequency[digit]++;
		n=n/10;
		l++;
	}
	if(l%2==0)
	{
        for (i = 0; i<= 9; i++){
            if (frequency[i]%2!=0) 
	    return 0;
        }
	}
	else
	{
	for (i = 0; i<= 9; i++)
	{
            if (frequency[i]%2!=0) 
	    j++;
        }
	if(j==1)
	return 1;
	}
}
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int i1 = sc.nextInt ();
int c=Freq(i1);
        if(c==1)
System.out.println ("palindrome possible");
else
System.out.println ("palindrome not possible");
    } 
}

