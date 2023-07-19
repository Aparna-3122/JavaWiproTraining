
import java.util.*;
public class FrequentDigit {
    public static int Freq(int i1, int i2, int i3, int i4) {
        int [] nums = {i1, i2, i3, i4};
        int [] frequency = new int[10];
        Arrays.fill(frequency,0);
	int n,i=0,max=0;
        for(;i<4;i++)
	{	n=nums[i];
		while(n!=0)
		{
                int digit = n % 10;
                frequency[digit]++;
		n=n/10;
		}
        }
        for (i = 0; i<= 9; i++){
            if (frequency[max] <= frequency[i]) 
	    max = i;
        }
        return max;
    }
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int i1 = sc.nextInt ();
        int i2 = sc.nextInt ();
	int i3 = sc.nextInt ();
	int i4 = sc.nextInt ();
        System.out.println (Freq(i1,i2,i3,i4));
    } 
}

