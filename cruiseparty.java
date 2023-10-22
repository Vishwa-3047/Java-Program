import java.util.*;
class cruiseparty
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] E = new int[T];
        int[] L = new int[T];
        for (int i = 0; i < T; i++)
        {
            E[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++)
        {
            L[i] = sc.nextInt();
        }
        sc.close();
        int maxGuests = 0;
        int currentGuests = 0;
        for (int i = 0; i < T; i++)
        {
            currentGuests += E[i] - L[i];
            if (currentGuests > maxGuests)
            {
                maxGuests = currentGuests;
            }
        }
        System.out.println(maxGuests);
    }
}
