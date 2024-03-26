package main;

public class SoPhuc {
	private double thuc ; 
	private double ao;
	
	
	public SoPhuc(double thuc, double ao) {
		super();
		this.thuc = thuc;
		this.ao = ao;
	}
	public SoPhuc() {
		this.thuc = 1.0;
		this.ao = -1.0;
	}
	
	public double getThuc() {
		return thuc;
	}
	public void setThuc(double thuc) {
		this.thuc = thuc;
	}
	public double getAo() {
		return ao;
	}
	public void setAo(double ao) {
		this.ao = ao;
	}
	
	@Override
	public String toString() {
		return "SoPhuc : " + this.thuc + " + " + this.ao;
	} 
	
	// tong hai so phuc
	public SoPhuc sum(SoPhuc other) {
		SoPhuc res = new SoPhuc();
		res.setAo(this.ao + other.ao);
		res.setThuc(this.thuc + other.thuc);
		return res;
	}
	
	//xac dinh modulus cua 1 so phuc 
	public double modulus() {
		double res = 0;
		res = Math.sqrt(Math.pow(this.thuc, 2) + Math.pow(this.ao, 2));
		return res;
	}
	
	
	
}
