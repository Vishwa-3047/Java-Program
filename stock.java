import java.util.*;
public class stock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int maxPrice = prices[0];
        int maxLoss = 0;
        for (int i = 1; i < n; i++) {
            int price = prices[i];
            if (price > maxPrice) {
                maxPrice = price;
            } else {
                int loss = maxPrice - price;
                if (loss > maxLoss) {
                    maxLoss = loss;
                }
            }
        }
        System.out.println(maxLoss);
    }
}
