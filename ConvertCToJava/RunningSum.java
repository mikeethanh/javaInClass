import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        int sum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            res[i] = sum;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] runningSums = runningSum(arr);
        System.out.println(Arrays.toString(runningSums));
    }
}

