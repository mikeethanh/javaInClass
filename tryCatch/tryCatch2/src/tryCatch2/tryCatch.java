package tryCatch2;

import java.util.Scanner;

public class tryCatch {
	public static void main(String[] args) {
        try {
            // Nhập chuỗi S_input
            System.out.print("Nhập chuỗi S_input: ");
            String sInput = new Scanner(System.in).nextLine();

            // Kiểm tra và đếm số lượng số thực
            boolean isAllValidNumbers = kiemTraSoThuc(sInput);
            int count = demSoThuc(sInput);

            // Hiển thị kết quả
            if (isAllValidNumbers) {
                System.out.println("Có " + count + " số thực trong chuỗi.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình");
        }
    }
	
	private static boolean kiemTraSoThuc(String sInput) throws Exception {
	    String[] arr = sInput.split(" ");
	    for (String s : arr) {
	        try {
	            Double.parseDouble(s);
	        } catch (NumberFormatException e) {
	            throw new Exception("Lỗi: " + s + " không phải là số thực!");
	        }
	    }
	    return true;
	}
	
	private static int demSoThuc(String sInput) {
	    String[] arr = sInput.split(" ");
	    int count = 0;
	    for (String s : arr) {
	        try {
	            Double.parseDouble(s);
	            count++;
	        } catch (NumberFormatException e) {
	            // Bỏ qua phần tử không hợp lệ
	        }
	    }
	    return count;
	}
}
