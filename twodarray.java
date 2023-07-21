import java.util.Scanner;
class twodarray {

    public static void main(String[] args) {
        // Input variables
        int n, m, p, k, j;

        // Output variable
        int monkeys_left;

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Read input values
        System.out.println("Enter the total number of monkeys: ");
        n = sc.nextInt();
        System.out.println("Enter the number of bananas each monkey can eat: ");
        k = sc.nextInt();
        System.out.println("Enter the number of peanuts each monkey can eat: ");
        j = sc.nextInt();
        System.out.println("Enter the total number of bananas: ");
        m = sc.nextInt();
        System.out.println("Enter the total number of peanuts: ");
        p = sc.nextInt();

        // Close the Scanner object
        sc.close();

        // Initialize monkeys_left to n
        monkeys_left = n;

        // Loop until there are no more bananas or peanuts or monkeys
        while (m > 0 || p > 0) {
            // If there are enough bananas for one monkey, reduce m by k and monkeys_left by 1
            if (m >= k) {
                m -= k;
                monkeys_left--;
            }
            // Else if there are less than k bananas but more than 0, reduce m to 0 and monkeys_left by 1
            else if (m > 0) {
                m = 0;
                monkeys_left--;
            }

            // If there are enough peanuts for one monkey, reduce p by j and monkeys_left by 1
            if (p >= j) {
                p -= j;
                monkeys_left--;
            }
            // Else if there are less than j peanuts but more than 0, reduce p to 0 and monkeys_left by 1
            else if (p > 0) {
                p = 0;
                monkeys_left--;
            }

            // If there are no more monkeys left, break the loop
            if (monkeys_left == 0) {
                break;
            }
        }

        // Print the output value
        System.out.println("Number of monkeys left on the tree: " + monkeys_left);

    }
}
