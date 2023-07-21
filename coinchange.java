import java.util.*;
class coinchange
{
    public static int countWays(int[] coins, int amount)
    {
        int[] ways = new int[amount + 1];
        ways[0] = 1;
        for (int coin : coins)
        {
            for (int i = coin; i <= amount; i++)
            {
                ways[i] += ways[i - coin];
            }
        }
        return ways[amount];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the coin array:");
        int size = sc.nextInt();
        int[] coins = new int[size];
        System.out.println("Enter the elements of the coin array:");
        for (int i = 0; i < size; i++)
        {
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the total amount:");
        int amount = sc.nextInt();
        int result = countWays(coins, amount);
        System.out.println("The number of ways to make change is: " + result);
    }
}
