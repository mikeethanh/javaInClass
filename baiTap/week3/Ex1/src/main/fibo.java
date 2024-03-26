package main;

public class fibo {
	
	public static void main(String[] args) {
		int n = 12;
		int fibo[] = new int[n];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2 ; i < n ; i++) {
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
		
		for(int elem :fibo) {
			System.out.print(elem+" ");
		}
		int A = 3;
		int B = 12;
		int sum = 0 ; 
		for(int i = 0 ; i < n ; i++) {
			if(fibo[i] <= B && fibo[i] >= A) {
				sum += fibo[i];
			}
		}
		System.out.println("Sum: "+sum);
	}
}
