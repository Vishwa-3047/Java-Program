import java.util.*;
class equal{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("arr1[]=");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("arr2[]=");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
