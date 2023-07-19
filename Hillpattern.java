import java.io.*;
import java.util.*;
public class HillPattern
{
public static int HillPattern(int i1, int i2, int i3) {
        int total = 0;
        int weight = i2;

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j <= i; j++) {
                total += weight;
            }
            weight += i3;
        }
        return total;
}

public static void main(String args[])
{
int w;
w=HillPattern(5,10,2);
System.out.println("Total weight is"+w);
}   
}