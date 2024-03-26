import java.util.Scanner;

public class buonVang {
    public static long solve(long[] a, long n) {
        long res = 0;
        for (int i = 0; i < n - 1; i++) {
            long z = maxElement(a, i + 1, n);
            res += a[i] < z ? z - a[i] : 0;
        }
        return res;
    }

    public static long maxElement(long[] a, int start, long end) {
        long max = a[start];
        for (int i = start + 1; i < end; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số ngày giao dịch: ");
        long n = scanner.nextLong();

        long[] a = new long[(int) n];
        System.out.print("Nhập giá vàng của các ngày: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long res = solve(a, n);
        System.out.println(res);
    }
}

