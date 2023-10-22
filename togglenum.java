import java.util.*;
class togglenum
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int t=n,c=0,val;
       while(n!=0)
       {
           n=n/2;
           c++;
       }
       val=(int) Math.pow(2,c)-1;
       System.out.println(val-t);
   }
}






/* public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k = (1 << (int)Math.floor(Math.log(n) / Math.log(2)) + 1) - 1;
        System.out.println(n^k);
        sc.close();
    }*/