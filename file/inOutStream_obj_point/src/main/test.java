package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) throws IOException {
		//Point2D a = new Point2D(2,3);
		//Point2D b = new Point2D(4,7);
		//System.out.println(a.toString());
		
		//ystem.out.println(a.distance(b));
		
		//a.symmetry();
		//System.out.println(a.toString());
		
		//a.translate(4, 4);
		//System.out.println(a.toString());
		
		//Point3D c = new Point3D(2,3,4);
		//Point3D d = new Point3D(4,7,5);
		
		//System.out.println(c.toString());
		
		//System.out.println(c.distance(d));
		//c.symmetry();
		//System.out.println(c.toString());
		
		//c.translate(2, 2, 2);
		//System.out.println(c.toString());
		
		//Doc cac point tu file vao trong 1 danh sach :
		ArrayList<Point2D> filePoints2D = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("E:\\theFourSemester\\JavaInCLass\\file\\point_br.txt");
			br = new BufferedReader(fr);
			String line; 
			while(true) {
				line = br.readLine();
				if(line == null) {
					System.out.println("FAIL");
					break;
				}else {
					String points[] = line.split("-");
					for(String point : points) {
						String xy[] = point.substring(1, point.length() - 1).split(";");
						int x = Integer.parseInt(xy[0]);
						int y = Integer.parseInt(xy[1]);
						filePoints2D.add(new Point2D(x,y));
						System.out.println("SUCCESS");
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr == null) {
				fr.close();
			}
			if(br == null) {
				br.close();
			}
		}
		System.out.println("Danh sanh cac diem 2D doc tu file la : ");
        for (Point2D point : filePoints2D) {
            System.out.println(point);
        }
        
        //ghi file ket qua 
        FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("E:\\theFourSemester\\JavaInCLass\\file\\point_bw.txt");
			bw = new BufferedWriter(fw);
			bw.write("NumberOfPoint: ");
			bw.write(Integer.toString(filePoints2D.size()));
			bw.newLine();
			bw.write("TotalDistance: ");	
			System.out.println("success");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw == null) {
				fw.close();
			}
			if(bw == null) {
				bw.close();
			}
		}
	}
}
