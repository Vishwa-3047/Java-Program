import java.util.Scanner;
public class password
{
    public static int productOfDigits(int number)
    {
        int product = 1;
        while (number > 0)
        {
            product = product * (number % 10);
            number = number / 10;
        }
        return product;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order ID:");
        int orderID = sc.nextInt();
        sc.close();
        int otp = productOfDigits(orderID);
        System.out.println("The one-time password for order ID " + orderID + " is: " + otp);
    }
}
