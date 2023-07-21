import java.util.Scanner;
public class carries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
        System.out.print("num2: ");
        int num2 = scanner.nextInt();
        int carries = a(num1, num2);
        System.out.println(carries);
    }
    public static int a(int num1, int num2) {
        int x = 0;
        int y = 0;
        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sum = digit1 + digit2 + x;
            if (sum > 9) {
                y++;
                x = 1;
            } else {
                x = 0;
            }
            num1 /= 10;
            num2 /= 10;
        }
        if (x > 0){
            y++;
        }
        return y;
    }
}
