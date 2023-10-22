import java.util.*;
class towerofhanoi
{
    public static void towers(int num, char frompeg, char topeg, char auxpeg)
    {
        if (num == 1)
        {
            System.out.println("\n Move disk 1 from peg " + frompeg + " to peg " + topeg);
            return;
        }
        towers(num - 1, frompeg, auxpeg, topeg);
        System.out.println("\n Move disk " + num + " from peg " + frompeg + " to peg " + topeg);
        towers(num - 1, auxpeg, topeg, frompeg);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        towers(num, 'A', 'C', 'B');
        sc.close();
    }
}
