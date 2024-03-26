import java.util.Scanner;

public class truyVanTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        System.out.print("Nhập số truy vấn: ");
        int m = scanner.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextLong();
        }

        long[] b = new long[n];
        System.arraycopy(a, 0, b, 0, n);
        for (int i = 1; i < n; i++) {
            b[i] += b[i - 1];
        }

        while (m-- > 0) {
            System.out.print("Nhập l và r cho truy vấn: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x--;
            y--;

            long result = b[y] - (x > 0 ? b[x - 1] : 0);
            System.out.println(result);
        }
    }
}
