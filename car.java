import java.util.*;
class  car
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A1=sc.nextInt();
        int B1=sc.nextInt();
        int C1=sc.nextInt();
        int D1=sc.nextInt();
        int E1=sc.nextInt();
        int A2=sc.nextInt();
        int B2=sc.nextInt();
        int C2=sc.nextInt();
        int D2=sc.nextInt();
        int E2=sc.nextInt();
        System.out.printf("Enter month :");
        int month=sc.nextInt();
        int m1=(D1/A1)*B1;
        int m2=(D2/A2)*B2;
        int petrol=(C1+m1+E1)*month;
        System.out.println(petrol);
        int diesel=(C2+m2+E2)*month;
        System.out.println(diesel);
        if(petrol<diesel)
        {
            System.out.println("petrol car is best");
        }
        else
        {
            System.out.println("diesel car is best");
        }

    }
}