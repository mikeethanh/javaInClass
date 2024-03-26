import java.util.ArrayList;
import java.util.List;

public class sangEratheones {
    public static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        // Danh dau tat ca cac so la so nguyen to
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Loc so nguyen to bang Sàng Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Luu cac so nguyen to vao danh sach primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int left = 2;
        int right = 1000;

        List<Integer> primes = sieve(right);

        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) >= left) {
                for (int j = i; j < primes.size(); j++) {
                    System.out.print(primes.get(j) + " ");
                }
                break;
            }
        }
    }
}

