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
	
	//rut gon
	public static int UCLN(int a , int b) {
		//TODO:
		return 1;
	}	
	
	public void RG() {
		int ucln = phanSo.UCLN(this.tuSo, this.mauSo);
		this.tuSo = this.tuSo / ucln;
		this.mauSo = this.mauSo / ucln;
	}
}
