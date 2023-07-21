import java.util.*;
class object2
{
public static void main(String args[])
{
int count,i,k,j,t,space=1;
Scanner myobj1=new Scanner(System.in);
String sc = myobj1.next();
System.out.println(sc);
count = sc.length();
space=count-1;
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
else{
System.out.print("    ");
for(i=0;i<count-2;i++)
{
for(k=1;k<=count;k++)
{
for(j=1;j<=space;j++)
{
System.out.ptint(" ");
}
space--;
System.out.print("*");
}
}
System.out.print("\n");
System.out.print("   ");
for(i=0;i<count-1;i++)
{
System.out.print("*");
}
{
System.out.print("\n");
System.out.print("  ");
{
for(i=0;i<count;i++)
{
System.out.print("*");
}
System.out.print("\n");
System.out.print("**"+sc+"**");
System.out.print("\n");
System.out.print("  ");

for(i=0;i<count;i++)
{
System.out.print("*");
}
}
}
}
}
}