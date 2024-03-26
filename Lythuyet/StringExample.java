public class StringExample {
    public static void main(String[] args) {
        // Sử dụng String
        String str1 = "Hello";
        str1 += " ";
        str1 += "World!";
        System.out.println("String result: " + str1);

        // Sử dụng StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" ");
        buffer.append("World!");
        System.out.println("StringBuffer result: " + buffer.toString());

        // Sử dụng StringBuilder
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" ");
        builder.append("World!");
        System.out.println("StringBuilder result: " + builder.toString());
    }
}
