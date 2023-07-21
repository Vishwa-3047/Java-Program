import java.util.Scanner;

class trailzero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        while (factorial % 5 == 0)
        {
            count++;
            factorial /= 5;
        }

        System.out.println("trail zero is " + n + "! is: " + count);
    }
}