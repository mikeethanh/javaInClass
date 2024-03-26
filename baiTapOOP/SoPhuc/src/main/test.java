package main;

public class test {
	public static void main(String[] args) {
		SoPhuc a = new SoPhuc(3.0,4.0);
		//System.out.println(a.toString());
		
		SoPhuc b = new SoPhuc();
		
		//SoPhuc res = a.sum(b);
		//System.out.println(res.toString());
		
		//System.out.println(b.modulus());
		
		SoPhuc c = new SoPhuc(6.0,0.0);
		SoPhuc d = new SoPhuc(9.0, 6.0);
		
		listSoPhuc list = new listSoPhuc();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		//list.print();
		
		//SoPhuc res = list.TBC();
		//System.out.println(res.toString());
		
		//SoPhuc res2 = list.MaxModulus();
		//System.out.println(res2.toString());
		
		System.out.println(list.khongCoPhanAo());
	}
}
