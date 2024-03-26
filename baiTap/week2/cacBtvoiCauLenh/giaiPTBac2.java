public class giaiPTBac2 {
    //ham de giai phuong trinh
    public static void solve(int a , int b , int c) {
        // xu li case a == 0
        if(a == 0) {
            System.out.println("x = " +((float)-c/b));
            return;
        }
        //tinh denta
        int denta = b*b-4*a*c;
        // cac case con lai
        if(denta < 0) {
            System.out.println("PT vo nghiem");
        } else if(denta > 0) {
            System.out.println("x1 = " +((float)(-b+Math.sqrt(denta))/(2*a)));
            System.out.println("x2 = " +((float)(-b-Math.sqrt(denta))/(2*a)));
        } else {
            System.out.println("x = " +((float)(-b/(2*a))));
        }
    }
    public static void main(String[] args) {
        // nhap 3 he so a,b,c
        int a = 3 ; 
        int b = 8 ; 
        int c = 1 ; 

        solve(a,b,c);
    }
}

