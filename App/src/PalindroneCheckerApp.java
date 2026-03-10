import java.util.ArrayDeque;
import java.util.Deque;
public class PalindroneCheckerApp {
    public class UseCase7PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "refer";
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : input.toCharArray()) {
                deque.addLast(c);
            }
            boolean isPalindrome = true;
            while (deque.size() > 1) {
                char front = deque.removeFirst();
                char rear = deque.removeLast();
                if (front != rear) {
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