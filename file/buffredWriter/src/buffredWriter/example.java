package buffredWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class example {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("E:/theFourSemester/JavaInCLass/file/bufferedWriter2.txt");
            bw = new BufferedWriter(fw);
            bw.write("25_3_2024");
            System.out.println("END!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {          
                if (bw != null) {
                    bw.close();
           
                if (fw != null) {
                    fw.close();
                }
        }
        }
    }
}

