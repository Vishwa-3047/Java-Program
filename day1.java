import java.util.*;
import java.util.Scanner;

class day1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String res="";
        res=res+String.valueOf(a.charAt(0)).toUpperCase();
        for(int i=1;i<a.length();i++)
        {
            if (a.charAt(i) == ' ')
            {
                res=res+" "+String.valueOf(a.charAt(i+1)).toUpperCase();
                i++;
            }
            else
            {
                res=res+a.charAt(i);
            }
        }
        System.out.println(res);
   }
}