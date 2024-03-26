public class bai1 {
    public static String solve(String s) {
        String S_output ; // khai bao bien output 
        //su dung ham replaceAll co san trong class String
        S_output = s.replaceAll("a","");

        // reverse the string
        StringBuilder reversed = new StringBuilder(S_output).reverse();
        return reversed.toString();
        }
    

    public static void main(String[] args) {
         // nhap vao S-input :
        String S_input = "Lap trinh Java khong don gian";
        System.out.println(S_input);

        String S__output = solve(S_input);

        System.out.println(S__output);
    }
}
