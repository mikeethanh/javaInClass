package tryCatch1;

import java.util.Random;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
        try {
            // Tạo mảng số nguyên ngẫu nhiên
            int[] arr = taoMangSoNguyen();

            // Nhập n từ người dùng
            int n = nhapN();

            // Kiểm tra n và hiển thị giá trị phần tử thứ n
            kiemTraVaHienThi(arr, n);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình");
        }
    }
	private static int[] taoMangSoNguyen() {
	    Random random = new Random();
	    int[] arr = new int[10];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = random.nextInt();
	    }
	    return arr;
	}
	
	private static int nhapN() throws Exception {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập số n: ");
	    String s = scanner.nextLine();

	    // Kiểm tra người dùng có nhập n hay không
	    if (s.isEmpty()) {
	        throw new Exception("Lỗi: Vui lòng nhập n!");
	    }

	    // Chuyển đổi s sang kiểu int
	    int n = Integer.parseInt(s);
	    return n;
	}
	
	private static void kiemTraVaHienThi(int[] arr, int n) throws Exception {
	    // Kiểm tra n
	    if (n < 0 || n >= arr.length) {
	        throw new Exception("Lỗi: n vượt quá kích thước mảng");
	    }

	    // Hiển thị giá trị phần tử thứ n
	    System.out.println("Giá trị phần tử thứ " + n + " là: " + arr[n]);
	}
}
