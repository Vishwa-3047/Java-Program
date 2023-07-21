import java.util.*;
class sale
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int b=a[n-1];
        int c=a[n-2];
        System.out.println(b+c);
    }
}