import java.util.*;
class stringform
{
    public static void main(String[]args)
    {
        Scanner myobj=new Scanner(System.in);
        int n=myobj.nextInt();
        String str[]=new String[n];
        String temp=" ";
        for(int i=0;i<n;i++)
        {
            str[i]=myobj.next();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(str[i].length()<str[j].length())
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(str[i]+" ");
        }
    }
}