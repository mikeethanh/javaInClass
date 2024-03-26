public class Fibonacci {
    //ham tính giá trị phần tử thứ n của dãy.
    public static int fibo(int n) {
        //n là tổng của số thứ (n-1) và số thứ (n-2)

        //su dung de quy 
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    //ham tim phan tu trong day gan voi gia tri gan voi gia tri cua n nhat
    public static int findclosestM(int val) {
        int a = 0, b = 1, c = a + b;

        while (c <= val) {
            a = b;
            b = c;
            c = a + b;
        }

        // So sánh giá trị với phần tử cuối cùng và phần tử trước đó
        return (Math.abs(val - b) <= Math.abs(val - c)) ? b : c;
    }

    public static void main(String[] args) {
        //nhap n 
        int n ; 
        n = 6;
        // nhap n o cau 2 :
        int n1;
        n1 = 14;

        //test:
        int test1 = fibo(n);
        System.out.println(test1);

        int test2 = findclosestM(n1);
        System.out.println(test2);
    }
}
