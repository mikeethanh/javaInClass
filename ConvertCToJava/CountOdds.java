public class CountOdds {
    public static int countOdds(int low, int high) {
        int start = low;
        int end = high;
        int res = 0;

        while (start <= end) {
            if (start % 2 != 0) {
                res += 1;
                start += 1;
            } else {
                start += 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        System.out.println(countOdds(low, high));
    }
}
