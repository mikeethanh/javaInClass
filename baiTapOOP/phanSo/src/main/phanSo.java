package main;

public class phanSo {
	private int tuSo;
	private int mauSo;
	
	//constuctor:
	public phanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public phanSo() {
		super();
		this.tuSo = 0;
		this.mauSo = 1;
	}
	
	//getter,setter
	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	//tostring
	@Override
	public String toString() {
		return "phanSo :"+this.tuSo +"/" +this.mauSo;
	}
	
	// tinhTong
	public phanSo sum(phanSo a ) {
		phanSo r = new phanSo();
		r.tuSo = a.tuSo * this.mauSo + this.tuSo * a.mauSo ;
		r.mauSo = a.mauSo * this.mauSo;
		return r;
	}
	//hieu
	public phanSo diff(phanSo a) {
	    phanSo r = new phanSo();
	    r.tuSo = a.tuSo * this.mauSo - this.tuSo * a.mauSo;
	    r.mauSo = a.mauSo * this.mauSo;
	    return r;
	}
	
	//tich 
	public phanSo product(phanSo a) {
	    phanSo r = new phanSo();
	    r.tuSo = a.tuSo * this.tuSo;
	    r.mauSo = a.mauSo * this.mauSo;
	    return r;
	}
	//thuong 
	public phanSo quotient(phanSo a) {
	    phanSo r = new phanSo();
	    r.tuSo = a.tuSo * this.mauSo;
	    r.mauSo = a.mauSo * this.tuSo;
	    return r;
	}
	//so sanh 
	public int soSanh(phanSo other) {
	    //
	    int mauSoChung = this.mauSo * other.mauSo;
	    int tuSoA = this.tuSo * other.mauSo;
	    int tuSoother = other.tuSo * this.mauSo;

	    // Compare the numerators
	    if (tuSoA > tuSoother) {
	        return 1; // Phân số hiện tại lớn hơn
	    } else if (tuSoother < tuSoother) {
	        return -1; // Phân số hiện tại nhỏ hơn
	    } else {
	        return 0; // Hai phân số bằng nhau
	    }
	}

	//rut gon
	//static : toan cuc
	public static int UCLN(int a , int b) {
		while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}	
	
	public void RG() {
		int ucln = phanSo.UCLN(this.tuSo, this.mauSo);
		this.tuSo = this.tuSo / ucln;
		this.mauSo = this.mauSo / ucln;
	}
	
	//check so nguyen 
	public boolean laSoNguyen() {
	    if(this.tuSo % this.mauSo == 0) {
	    	return true;
	    }
	    return false;
	}
}
