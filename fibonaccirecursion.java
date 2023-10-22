import java.util.*;
class fibonaccirecursion
{
    public static int fiborecur(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if(n==1 || n==2)
        {
            return 1;
        }
        return fiborecur(n-2) + fiborecur(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print(" "+fiborecur(i));
        }
    }
}
