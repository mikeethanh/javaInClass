import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class goldbach {
    public static int countWays(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        // Sàng Eratosthenes để tìm các số nguyên tố từ 2 đến n
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
                primes.add(i);
            }
        }

        int count = 0;

        // Duyệt qua tất cả các cặp số nguyên tố (a, b)
        for (int i = 0; i < primes.size(); ++i) {
            for (int j = i; j < primes.size(); ++j) {
                int a = primes.get(i);
                int b = primes.get(j);
                int c = n - a - b;

                // Kiểm tra xem c có phải số nguyên tố không
                if (c >= b && isPrime[c]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if (n > 6 && n < 100000) {
            int result = countWays(n);
            System.out.println(result);
        }
    }
}
