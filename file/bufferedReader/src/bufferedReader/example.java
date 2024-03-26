package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class example {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("E:\\theFourSemester\\JavaInCLass\\file\\bufferedReader.txt");
			br = new BufferedReader(fr);
			String line;
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br != null) {
                br.close();
       
            if (fr != null) {
                fr.close();
            }
		}
	}
}
}
