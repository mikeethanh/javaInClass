import java.util.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        // Tạo một bản sao của mảng để không ảnh hưởng đến mảng gốc
        int[] tempNums = Arrays.copyOf(nums, nums.length);

        // Tìm hai phần tử lớn nhất trong mảng
        int max1 = Arrays.stream(tempNums).max().getAsInt();
        for (int i = 0; i < tempNums.length; i++) {
            if (tempNums[i] == max1) {
                tempNums[i] = Integer.MIN_VALUE; // Đặt giá trị của phần tử lớn nhất thứ nhất thành giá trị nhỏ nhất
                break;
            }
        }

        int max2 = Arrays.stream(tempNums).max().getAsInt();

        // Tính tích lớn nhất
        int result = (max1 - 1) * (max2 - 1);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }
}
