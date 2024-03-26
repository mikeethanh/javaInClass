package main;

import java.io.IOException;

public class test {
	public static void main(String[] args) {
		phanSo a = new phanSo(1,2);
		phanSo b = new phanSo(3,4);
		phanSo c = new phanSo(4,5);
		phanSo d = new phanSo(8,2);
		phanSo e = new phanSo(6,9);
		System.out.println(a.toString());
		
		e.RG();
		System.out.println(e.toString());
		
		TapHopPhanSo listPhanSo = new TapHopPhanSo();
		listPhanSo.themPhanSo(a);
		listPhanSo.themPhanSo(b);
		listPhanSo.themPhanSo(c);
		listPhanSo.themPhanSo(d);
		listPhanSo.themPhanSo(e);
		
		listPhanSo.inThongTin();
		
		//Ghi cac phan so vao File 
		try {
			listPhanSo.WriteData();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("----------");
		//Doc phan so tu File
		try {
			listPhanSo.ReadData();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		listPhanSo.inThongTin();
	}
}
