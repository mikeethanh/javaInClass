import java.io.File;

public class file2 {

	private static int cppCount = 0;
    private static int batCount = 0;

    public static void main(String[] args) {
        // Thay đổi đường dẫn sau thành đường dẫn thư mục hoặc ổ đĩa bạn muốn quét
        String directoryPath = "E:\\BasicLanguages";

        System.out.println("Bắt đầu quét thư mục: " + directoryPath);
        scanDirectory(new File(directoryPath));
        System.out.println("Quét thư mục hoàn tất.");
        System.out.println("Tổng số file .cpp: " + cppCount);
        System.out.println("Tổng số file .bat: " + batCount);
    }

    public static void scanDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Nếu là thư mục, thực hiện đệ quy để quét tiếp
                    scanDirectory(file);
                } else {
                    // Nếu là file, kiểm tra đuôi file
                    String fileName = file.getName();
                    if (fileName.endsWith(".cpp")) {
                        System.out.println("File .cpp được tìm thấy: " + file.getAbsolutePath());
                        cppCount++;
                    } else if (fileName.endsWith(".bat")) {
                        System.out.println("File .bat được tìm thấy: " + file.getAbsolutePath());
                        batCount++;
                    }
                }
            }
        }
    }

}
