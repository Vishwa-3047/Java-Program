import java.util.Scanner;
class m2 {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int digit = num % 100;
        int greatestNumber = digit;
        while (num > 0)
        {
            digit = num % 100;
            if (digit > greatestNumber && digit < 100)
            {
                greatestNumber = digit;
            }
            num /= 10;
        }
        System.out.println(greatestNumber);
    }
}
