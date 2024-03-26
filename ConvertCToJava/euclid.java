import java.util.Scanner;

public class euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("UCLN: " + a);
    }
}
