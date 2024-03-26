package main;

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
}
