
import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {
		File file = new File("E:\\theFourSemester\\JavaInCLass\\file\\FileExample.txt");
		
		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.length());
	}
}
