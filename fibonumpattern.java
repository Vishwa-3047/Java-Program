import java.util.*;
class fibonumpattern
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = n; i > 0; i--)
        {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < i; j++)
            {
                line.append(i);
            }
            System.out.println(line.toString());
        }
    }
}
