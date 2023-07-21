import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        a=a.toUpperCase();
        b=b.toUpperCase();
        int n,i,j;
        if(a.length()>b.length())
            n=a.length();
        else
            n=b.length();
        for(i=0;i<=n;i++)
        {
            if(i<=a.length())
            {
                for(j=0;j<i;j++)
                    System.out.print(a.charAt(j));
            }
            else
            {				for(j=0;j<a.length();j++)
                System.out.print(b.charAt(j));}
            if(i<b.length())
            {	for(j=0;j<i;j++)
                System.out.print(b.charAt(j));}
            else
            {for(j=0;j<b.length();j++)
                System.out.print(b.charAt(j));}


            System.out.println(" ");
        }

        sc.close();
    }

}