import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public static void buildArray(int[] target, int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int szOfTarget = target.length;
        int count = 0;
        for (int num : arr) {
            if (contains(target, num)) {
                System.out.print("Push ");
                count++;
                if (count == szOfTarget) {
                    return;
                }
            } else {
                System.out.print("Push Pop ");
            }
        }
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] target = { 1, 3 };
        int n = 3;
        buildArray(target, n);
    }
}
