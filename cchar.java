import java.util.*;
class cchar {
    public static void main(String args[])
    {
        for (int row=0;row<11;row++)
        {
            for (int col=0;col<11;col++)
            {
                if((row == 0 && col ==4) || (row == 0 && col ==5)|| (row==0 && col==6) || (row==0 && col==7)|| (row==3 && col==0)|| (row==3 && col==1)||
                        (row==4 && col==0)||(row==4 && col==1) || (row==5 && col==0) || (row==5 && col==1) || (row==6 && col==0) || (row==6 && col==1) || (row==7 && col==0) || (row==7 && col==1)
                        || (row == 10 && col ==4) || (row == 10 && col ==5)|| (row==10 && col==6) || (row==10 && col==7))
                {
                    System.out.print(" #");
                }
                else if((row == 1 && col ==2) || (row == 1 && col ==3)|| (row==1 && col==8) || (row==1 && col==9)|| (row == 2 && col ==1) || (row ==2 && col ==2)|| (row==2 && col==9) || (row==2 && col==10) || (row == 8 && col ==1) || (row == 8 && col ==2)|| (row==8 && col==9) || (row==8 && col==10)|| (row == 9 && col ==2) || (row == 9 && col ==3)|| (row==9 && col==8) || (row==9 && col==9))
                {

                    System.out.print(" *");
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

