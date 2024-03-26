package main;

public class Ex2 {
	public static void main(String[] args) {
		int S[] = {1,1,3,4,5,7,0,8,8,8,5};
		int counts = 0 ;
		//xet 3 toa do dau:
		//xay o thung lung
		if((S[1] <= S[0] || S[1] < S[0]) && S[1] < S[2]) {
			counts++;
		}
		//xay o dinh
		if(S[1] < S[0] && (S[0] >= S[2] || S[0] > S[2])) {
			counts++;
		}
		//
		if(S[0] > S[1]) {
			counts++;
		}else if(S[0] < S[1]){
			counts++;
		}
		//
		for(int i = 2 ; i < S.length-1;i++) {
			//thung lung
			if(S[i] < S[i-1] && S[i] < S[i+1]) {
				counts++;
			}
			//dinh
			if(S[i] > S[i-1] && S[i] < S[i+1]) {
				counts++;
			}
		}
		//
		int n = S.length;
		if(S[n-2] > S[n-1]) {
			counts++;
		}else if(S[n-2] < S[n-1]){
			counts++;
		}
		System.out.println(counts);
	}
}
