import java.util.HashMap;
import java.util.Map;

public class NumIdenticalPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : nums) {
            if (occurrences.containsKey(num)) {
                count += occurrences.get(num);
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                occurrences.put(num, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }
}
