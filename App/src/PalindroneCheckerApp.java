import java.util.LinkedList;
public class PalindroneCheckerApp {
    public class UseCase8PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "level";
            LinkedList<Character> list = new LinkedList<>();
            for (char c : input.toCharArray()) {
                list.addLast(c);
            }
            boolean isPalindrome = true;
            while (list.size() > 1) {
                char first = list.removeFirst();
                char last = list.removeLast();
                if (first != last) {
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