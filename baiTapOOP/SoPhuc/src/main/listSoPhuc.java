package main;

import java.util.ArrayList;

public class listSoPhuc {
	private ArrayList<SoPhuc> list;

	public listSoPhuc() {
		this.list = new ArrayList<>();
	}
	
	//them cac phan so vao danh sach 
	public void add(SoPhuc soPhuc) {
		list.add(soPhuc);
	}
	
	//hien thi danh sach cac so phuc 
	public void print() {
		System.out.println("danh sach cac so phuc: ");
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	// tinh trung binh cong cac so phuc trong day 
	public SoPhuc TBC() {
		SoPhuc res = new SoPhuc();
		double Sumthuc = 0;
		double Sumao = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			Sumthuc += list.get(i).getThuc();
			Sumao += list.get(i).getAo();
		}
		res.setThuc(Sumthuc);
		res.setAo(Sumao);
		return res;
	}


	// xac dinh so phuc co modulus lon nhat 
	public SoPhuc MaxModulus() {
		SoPhuc res = null;
		double maxModulus = list.get(0).modulus();
		for(int i = 1; i < list.size(); i++) {
			if(maxModulus < list.get(i).modulus()) {
				maxModulus = list.get(i).modulus();
				res = list.get(i);
			}
		}
		return res ; 
	}
	
	// dem so luong so phuc thoa man dieu kiem khong co phan ao 
	public int khongCoPhanAo() {
		int res = 0; 
		for(int i = 0 ; i < list.size();i++) {
			if(list.get(i).getAo() == 0) {
				res++;
			}
		}
		return res ; 
	}
}
