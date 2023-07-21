import java.util.Scanner;
class flames
{
    public static void main(String args[])
    {
        flames ob=new flames();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String n1=sc.next();
        System.out.println("Enter a partner name:");
        String n2=sc.next();
        int tocut=ob.cancel(n1,n2);
        String f="FLAMES";
        while(f.length()!=1)
        {
            int cut=0;
            for(int k=1;k<=tocut;k++)
            {
                if(cut>=f.length())
                    cut=0;
                    ++cut;
            }
            f=f.substring(0,cut-1)+f.substring(cut);
            f=f.trim();
        }
        switch(f)
        {
            case "F":
                System.out.println("You got friend");
                break;
            case "L":
                System.out.println("You got love");
                break;
            case "A":
                System.out.println("You got affection");
                break;
            case "M":
                System.out.println("You got marriage");
                break;
            case "E":
                System.out.println("You got enemy");
                break;
            case "S":
                System.out.println("You got sister");
                break;
        }
    }
    int cancel(String n1,String n2)
    {
        int total=n1.length()+n2.length();
        int canc=0;
        for(int i=0;i<n1.length() ;i++)
        {
            for(int j=0;j<n2.length();j++)
            {
                if(n1.charAt(i)==n2.charAt(j))
                {
                    ++canc;
                    n2=n2.substring(0,j)+n2.substring(j+1,n2.length());
                    break;
                }
            }
        }
        int tocut=total-(canc*2);
        return tocut;
    }
}
