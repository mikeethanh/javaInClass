public class MaxPower {
    public static int maxPower(String s) {
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(maxPower(s));
    }
}

