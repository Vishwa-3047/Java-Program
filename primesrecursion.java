import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
class primesrecursion
{
    public static int checkprime(int i, int n)
    {
        if(n==i)
        {
            return 0;
        }
        else if(n%i==0)
        {
            return 1;
        }
        else
        {
            return checkprime(i+1,n);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(checkprime(2,n)==0)
        {
            System.out.println("It is a Prime Number");
        }
        else
        {
            System.out.println("It is not a Prime Number");
        }
    }
}
