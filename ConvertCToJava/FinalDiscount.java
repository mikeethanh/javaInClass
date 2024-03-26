import java.util.Arrays;

public class FinalDiscount {
    public static int[] finalDiscount(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] discountedPrices = finalDiscount(prices);
        System.out.println(Arrays.toString(discountedPrices));
    }
}
