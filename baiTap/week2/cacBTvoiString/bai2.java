

public class bai2 {
    public static void main(String[] args) {
        String input = "2 34.5 -12.9 0 12 1.98";

        boolean isValid = isValidNumberString(input);

        if (isValid) {
            String[] numbers = input.split(" ");
            int count = numbers.length;

            System.out.println("Output: true, có " + count + " số.");
        } else {
            System.out.println("Output: false.");
        }
    }

    // Phương thức kiểm tra chuỗi có chứa các số hợp lệ không
    private static boolean isValidNumberString(String input) {
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            try {
                // Thử chuyển đổi từng phần tử thành số
                //Hàm Double.parseDouble(number) được sử dụng để chuyển đổi một chuỗi (String) chứa giá trị số sang kiểu dữ liệu double.
                Double.parseDouble(number);
            } catch (NumberFormatException e) {
                // Nếu có ngoại lệ NumberFormatException, chuỗi không hợp lệ
                return false;
            }
        }

        return true;
    }
}
