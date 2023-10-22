import java.util.*;
class primerecursion
{
    public static int prime(int x,int i)
    {
        if(i<x)
        {
            if(x%i!=0)
            {
                return prime(x,++i);
            }
            else
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primerecursion obj=new primerecursion();
        int x=obj.prime(n, 2);
        if(x==1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
}