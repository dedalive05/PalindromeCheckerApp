import java.util.Stack;
public class PalindroneCheckerApp {
    public class UseCase5PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "noon";
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray()) {
                stack.push(c);
            }
            boolean isPalindrome = true;
            for (char c : input.toCharArray()) {
                char popped = stack.pop();

                if (c != popped) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("\"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + input + "\" is NOT a Palindrome.");
            }
        }
    }
}