import java.util.ArrayList;
import java.util.Arrays;

public class btMang {
    // Task 1: Đếm số phần tử dương không chia hết cho 3 trong dãy.
    public static int findNumberNotDivisibleBy3(int a[], int n) {
        int count = 0; // luu bien ket qua
        for (int elem : a) { // for each
            if (elem > 0 && elem % 3 != 0) {
                count++;
            }
        }
        return count;
    }

    // Task 2: Tính tổng các phần tử nằm trong khoảng [-5, 25] và trung bình cộng của chúng.
    public static double calculateMeanInRange(int a[], int n) {
        int sum = 0;
        int count = 0;
        for (int elem : a) {
            if (elem >= -5 && elem <= 25) {
                sum += elem;
                count++;
            }
        }
        return (count > 0) ? (double) sum / count : 0;
    }

    // Task 3: Xác định phần tử lớn nhất trong dãy chia hết cho 3.
    public static int findMaxElementDivisibleBy3(int a[], int n) {
        int maxElement = Integer.MIN_VALUE; // su dung phuong thuc MIN_VALUE trong class Interger
        for (int elem : a) {
            if (elem % 3 == 0 && elem > maxElement) {
                maxElement = elem;
            }
        }
        return (maxElement != Integer.MIN_VALUE) ? maxElement : 0;
    }

    // Task 4: Sắp xếp dãy số để các phần tử có giá trị tuyệt đối tăng dần.
    public static void sortArrayByAbsoluteValue(int a[], int n) {
        //bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Math.abs(a[j]) > Math.abs(a[j + 1])) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Task 5: Loại bỏ các phần tử chia hết cho 5 nhưng không chia hết cho 3 khỏi dãy số.
    public static void removeElementsDivisibleBy5NotBy3(int a[], int n) {
        // Sử dụng ArrayList để lưu trữ các phần tử không chia hết cho 5 hoặc chia hết cho 3.
        ArrayList<Integer> result = new ArrayList<>();
        for (int elem : a) {
            if (elem % 5 != 0 && elem % 3 == 0) {
                result.add(elem);
            }
        }

        // Chuyển đổi ArrayList thành mảng int.
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
    }

    public static void main(String[] args) {
        // Nhập vào mảng số nguyên.
        int a[] = {4, 2, 1, 5, 3, 6, 9, 2, 1, 10, -5, -4, -2, -1, 0, 15, -1, -1};
        // n = size của mảng.
        int n = a.length;

        // Task 1
        int count = findNumberNotDivisibleBy3(a, n);
        System.out.println("Số phần tử dương không chia hết cho 3: " + count);

        // Task 2
        double mean = calculateMeanInRange(a, n);
        System.out.println("Tổng và trung bình cộng của phần tử trong khoảng [-5, 25]: " + mean);

        // Task 3
        int maxElement = findMaxElementDivisibleBy3(a, n);
        System.out.println("Phần tử lớn nhất chia hết cho 3: " + maxElement);

        // Task 4
        sortArrayByAbsoluteValue(a, n);
        System.out.println("Dãy sau khi sắp xếp theo giá trị tuyệt đối tăng dần: " + Arrays.toString(a));

        // Task 5
        removeElementsDivisibleBy5NotBy3(a, n);
        System.out.println("Dãy sau khi loại bỏ các phần tử chia hết cho 5 nhưng không chia hết cho 3: " + Arrays.toString(a));
    }
}
