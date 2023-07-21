import java.util.*;
class divisor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("input:");
int N=sc.nextInt();

for (int i=1;i<=N;i++)
{
if (N%i==0)
{
System.out.println(i+" ");
}
}
}
}


