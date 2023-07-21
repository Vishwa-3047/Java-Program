import java.util.Scanner;

public class doublewithoutarith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int doubledNumber = doubleNumber(number);
        System.out.println(doubledNumber);
        scanner.close();
    }
    public static int doubleNumber(int number) {
        int doubledNumber = number << 1;
        return doubledNumber;
    }
}
