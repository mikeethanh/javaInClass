public class XOROperation {
    public static int xorOperation(int n, int start) {
        int result = start;

        for (int i = 1; i < n; i++) {
            // Calculate the XOR of the current element with the previous result
            result ^= (start + 2 * i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }
}
