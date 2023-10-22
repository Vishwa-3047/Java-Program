import java.util.*;
public class charsearch
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array Size :");
        String[] str=new String[scan.nextInt()];
        scan.nextLine();
        for(int i=0;i<str.length;i++)
        {
            str[i]=scan.nextLine();
        }
        System.out.println("Enter A word To Find :");
        boolean word=true;
        String str2=scan.nextLine();
        for(int i=0;i<str.length;i++)
        {
            if(str2==str[i])
            {
                word=true;
                break;
            }
        }
        if(word==true)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }

    }
}
