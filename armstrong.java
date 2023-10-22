import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        int num,original_num,rem,result=0;
        Scanner sc=new Scanner(System.in);
        num =sc.nextInt();
        original_num=num;
        while(original_num !=0)
        {
            rem = original_num % 10;
            result += Math.pow(rem, 3);
            original_num /= 10;
        }
        if(result == num)
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}