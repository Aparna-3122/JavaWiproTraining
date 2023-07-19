import java.io.*;
import java.util.*;
public class AlternateAddSub {
    public static int AddSub(int input1,int input2){
        int result = input1;
        int check = 0;

        if (input2 == 1) check = 1;

        for (int i = input1 - 1, j = 0; i >= 1; i--, j++) {
            if (j % 2 == check) result += i;
            else result -= i;
        }
        return result;
    }
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int i1 = sc.nextInt ();
        System.out.println("Enter the option");
        int i2 = sc.nextInt ();

        System.out.println (AddSub(i1,i2));
    } 
}
