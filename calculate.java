import java.util.Scanner;

class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m : ");
        int m = sc.nextInt();
        System.out.print("n : ");
        int n = sc.nextInt();
        int sum = calculate(m, n);
        System.out.println(sum);
    }

    public static int calculate(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
