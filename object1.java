import java.util.*;
class object1
{
public static void main(String args[])
{
int count,i;
Scanner myobj1=new Scanner(System.in);
String sc = myobj1.next();
System.out.println(sc);
count = sc.length();
System.out.println(count);
if(count%2==0)
{
System.out.print("  ");
{
for(i=1;i<=count;i++)
{

System.out.print("*");
}
System.out.print("\n");
System.out.println("**"+sc+"**");
System.out.print("  ");
for(i=1;i<=count;i++)
{
System.out.print("*");
}
}
}
else
{
System.out.print("  ");
{
for(i=0;i<count;i++)
{
System.out.print("*");
}
System.out.print("\n");
System.out.println("**"+sc+"**");
System.out.print("  ");
for(i=0;i<count;i++)
{
System.out.print("*");
}
}
}
}
}