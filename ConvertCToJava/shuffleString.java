public class shuffleString {
    public static String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }
}
