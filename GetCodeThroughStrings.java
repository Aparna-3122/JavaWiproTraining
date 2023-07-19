import java.io.*;
import  java.util.*;

class GetCodeThroughStrings
{
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
        String[] words = str.split(" ");
        int pin = 0;

        for(String word : words) {
            pin += word.length();
        }
        if (String.valueOf(pin).length() == 1)
	System.out.println(pin);
        int pin2 = 0;
        String pinStr = String.valueOf(pin);
        for (int i = 0; i < pinStr.length(); i++) {
        pin2 += Integer.parseInt(String.valueOf(pinStr.charAt(i)));
        }

        System.out.println(pin2);
    }
}