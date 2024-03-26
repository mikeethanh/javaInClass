package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

//ke thua class phanSo
public class TapHopPhanSo extends phanSo {
	 private ArrayList<phanSo> tapHop;

	    // Constructor
	    public TapHopPhanSo() {
	        this.tapHop = new ArrayList<>();
	    }

	    // them phan so vao tap hop
	    public void themPhanSo(phanSo ps) {
	        this.tapHop.add(ps);
	    }

	    // Tìm max
	    public phanSo timPhanSoLonNhat() {
	        if (tapHop.isEmpty()) {
	            return null; // Trường hợp tập hợp rỗng
	        }

	        phanSo maxPhanSo = tapHop.get(0);

	        for (int i = 1; i < tapHop.size(); i++) {
	            if (tapHop.get(i).soSanh(maxPhanSo) ==1) {
	                maxPhanSo = tapHop.get(i);
	            }
	        }

	        return maxPhanSo;
	    }

	    // tinh tong
	    public phanSo tinhTongPhanSo() {
	        if (tapHop.isEmpty()) {
	            return new phanSo(0, 1); //truong hop rong
	        }

	        phanSo tongPhanSo = tapHop.get(0);

	        for (int i = 1; i < tapHop.size(); i++) {
	            tongPhanSo = tongPhanSo.sum(tapHop.get(i));
	        }

	        return tongPhanSo;
	    }
	    
	    //cac so nguyen
	    public int cacSoNguyen() {
	    	int res = 0;
	    	for(int i = 0 ; i < tapHop.size();i++) {
	    		if(tapHop.get(i).laSoNguyen()) {
	    			res++;
	    		}
	    	}
	    	return res;
	    }

	    // In thông tin của tập hợp
	    public void inThongTin() {
	        System.out.println("Tap hop cac phan so:");
	        for (phanSo ps : tapHop) {
	            System.out.println(ps);
	        }	 
	    }
	    
	    //Ghi cac phan so vao File 
	    public void WriteData() throws IOException {
	    	OutputStream os = null;
	    	ObjectOutputStream oos = null;
	    	try {
	    		os = new FileOutputStream("E:\\theFourSemester\\JavaInCLass\\file\\obj_phanSo.txt");
	    		oos = new ObjectOutputStream(os);
	    		for(phanSo Phanso : tapHop) {
	    			oos.writeObject(Phanso);
	    		}
	    		System.out.println("END");
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(oos != null) {
					oos.close();
				}
				if(os != null) {
					os.close();
				}
			}
	    }
	    
	    ////Doc phan so tu File
	    public void ReadData() throws IOException, ClassNotFoundException {
	    	InputStream is = null;
	    	ObjectInputStream ois = null;
	    	try {
	    		is = new FileInputStream("E:\\theFourSemester\\JavaInCLass\\file\\obj_phanSo.txt");
	    		ois = new ObjectInputStream(is);
	    		phanSo temp = null;
	    		while(true) {
	    			Object oj = ois.readObject();
	    			if(oj == null) {
	    				break;
	    			}else {
	    				temp = (phanSo) oj;
	    				this.themPhanSo(temp);
	    			}
	    		}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(ois != null) {
					ois.close();
				}
				if(is != null) {
					is.close();
				}
			}
	    }
}
