import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;

public class validParenthenes {
    public static boolean isValid(String s) {
        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');
        bracketsMap.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != bracketsMap.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with brackets: ");
        String s = scanner.nextLine();

        if (isValid(s)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

