import java.util.Scanner;
class hpheart
{
    public static void main(String args[])
    {
        Scanner mi=new Scanner(System.in);
        int n=mi.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if((i==0 && j==3)||(i==0 && j==4)||(i==0 && j==5)||(i==0 && j==15)||(i==0 && j==16)||(i==0 && j==17))
                {
                    System.out.print("* ");
                }
                else if((i==1 && j==2)||(i==1 && j==6)||(i==1 && j==14)||(i==1 && j==18))
                {
                    System.out.print("* ");
                }
                else if((i==2 && j==1)||(i==2 && j==7)||(i==2 && j==13)||(i==2 && j==19))
                {
                    System.out.print("* ");
                }
                else if((i==3 && j==0)||(i==3 && j==8)||(i==3 && j==12)||(i==3 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==4 && j==0)||(i==4 && j==9)||(i==4 && j==11)||(i==4 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==5 && j==0)||(i==5 && j==10)||(i==5 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==6 && j==0)||(i==6 && j==4)||(i==6 && j==7)||(i==6 && j==9)||(i==6 && j==11)||(i==6 && j==13)||(i==6 && j==14)||(i==6 && j==15)||(i==6 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==7 && j==0)||(i==7 && j==4)||(i==7 && j==7)||(i==7 && j==8)||(i==7 && j==10)||(i==7 && j==12)||(i==7 && j==13)||(i==7 && j==15)||(i==7 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==8 && j==0)||(i==8 && j==4)||(i==8 && j==5)||(i==8 && j==6)||(i==8 && j==7)||(i==8 && j==8)||(i==8 && j==12)||(i==8 && j==13)||(i==8 && j==14)||(i==8 && j==15)||(i==8 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==9 && j==0)||(i==9 && j==4)||(i==9 && j==7)||(i==9 && j==9)||(i==9 && j==11)||(i==9 && j==13)||(i==9 && j==20))
                {
                    System.out.print("* ");
                }
                else if((i==10 && j==1)||(i==10 && j==4)||(i==10 && j==7)||(i==10 && j==10)||(i==10 && j==13)||(i==10 && j==19))
                {
                    System.out.print("* ");
                }
                else if((i==11 && j==2)||(i==11 && j==18))
                {
                    System.out.print("* ");
                }
                else if((i==12 && j==3)||(i==12 && j==17))
                {
                    System.out.print("* ");
                }
                else if((i==13 && j==4)||(i==13 && j==16))
                {
                    System.out.print("* ");
                }
                else if((i==14 && j==5)||(i==14 && j==15))
                {
                    System.out.print("* ");
                }
                else if((i==15 && j==6)||(i==15 && j==14))
                {
                    System.out.print("* ");
                }
                else if((i==16 && j==7)||(i==16 && j==13))
                {
                    System.out.print("* ");
                }
                else if((i==17 && j==8)||(i==17 && j==12))
                {
                    System.out.print("* ");
                }
                else if((i==18 && j==9)||(i==18 && j==11))
                {
                    System.out.print("* ");
                }
                else if((i==19 && j==10))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
