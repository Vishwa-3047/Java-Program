import java.util.*;
class handshake
{
    static int maxHandshakes(int n)
    {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(maxHandshakes(n));
    }
}