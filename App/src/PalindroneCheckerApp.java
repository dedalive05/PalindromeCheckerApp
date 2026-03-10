import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class PalindroneCheckerApp {
    public class UseCase6PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "civic";
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray()) {
                queue.add(c);
                stack.push(c);
            }
            boolean isPalindrome = true;
            while (!queue.isEmpty()) {
                char fromQueue = queue.poll();
                char fromStack = stack.pop();
                if (fromQueue != fromStack) {
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