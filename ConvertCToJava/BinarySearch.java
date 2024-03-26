import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static int binarySearch(ArrayList<Integer> a, int b) {
        int l = 0;
        int r = a.size() - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (b > a.get(m)) {
                l = m + 1;
            } else if (b < a.get(m)) {
                r = m - 1;
            } else {
                return m;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, -1, 0, 3, 5, 9, 12);
        int target = 2;

        int res = binarySearch(nums, target);
        System.out.println(res);
    }
}
