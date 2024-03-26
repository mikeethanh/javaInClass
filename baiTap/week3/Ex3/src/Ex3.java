
public class Ex3 {
	public static boolean check(String S) {
		
		try {
			Double.parseDouble(S);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static void main(String[] args) {
		String S = "123 343423 fgd";
		String[] numbers = S.split(" ");
		int res = 0;
		for(String number :numbers) {
			if(check(number)) {
				double i = Double.parseDouble(number);
				res += i;
			}
		}
		System.out.println(res);
	}
	
}
