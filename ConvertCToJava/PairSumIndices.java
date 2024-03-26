import java.util.HashMap;
import java.util.Scanner;

public class PairSumIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] a = new int[100];
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            mp.put(a[i], i);
        }

        for (int i = 0; i < n; i++) {
            int x = s - a[i];
            if (mp.containsKey(x)) {
                System.out.println(i + " " + mp.get(x));
                break;
            }
        }
    }
}

