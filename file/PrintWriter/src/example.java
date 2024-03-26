import java.io.IOException;
import java.io.PrintWriter;

public class example {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("E:\\theFourSemester\\JavaInCLass\\file\\printWriter.txt");	
			pw.print("data ");
			pw.print(23);
			pw.print(' ');
			pw.print("hello");
			pw.println();
			pw.println();		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.flush();
				pw.close();
			}
		}
	}
}
