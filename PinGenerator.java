import java.io.*;
import java.util.*;
public class PinGenerator {
    public static int pin(int i1, int i2, int i3) {
        int ip1, ip2, ip3, min, max,pin=0;
        ip1 = i1 % 10;
        ip2 = i2 % 10;
        ip3 = i3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        pin = min;

        i1=i1/10;
        i2=i2/10;
	i3=i3/10;
        ip1 = i1 % 10;
        ip2 = i2 % 10;
        ip3 = i3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(max, ip1);
        max = Math.max(max, ip2);
        max = Math.max(max, ip3);
        pin = min * 10 + pin;

        i1=i1/ 10;
        i2=i2/ 10;
	i3=i3/ 10;
        ip1 = i1 % 10;
        ip2 = i2 % 10;
        ip3 = i3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(max, ip1);
        max = Math.max(max, ip2);
        max = Math.max(max, ip3);
        pin = min * 100 + pin;
        pin = max * 1000 + pin;

        return pin;
    }
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int i1 = sc.nextInt ();
        int i2 = sc.nextInt ();
	int i3 = sc.nextInt ();
        System.out.println (pin(i1,i2,i3));
    } 
}
