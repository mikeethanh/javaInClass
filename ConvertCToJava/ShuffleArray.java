import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] nums1 = Arrays.copyOfRange(nums, 0, n);
        int[] nums2 = Arrays.copyOfRange(nums, n, nums.length);
        int[] res = new int[nums.length];

        for (int i = 0, j = 0; i < n; i++) {
            res[j++] = nums1[i];
            res[j++] = nums2[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] shuffled = shuffle(nums, n);

        // In kết quả
        System.out.println(Arrays.toString(shuffled));
    }
}

