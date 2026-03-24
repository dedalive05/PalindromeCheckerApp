import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static class UseCase12PalindromeCheckerApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            PalindromeStrategy strategy = new StackStrategy();
            PalindromeContext context = new PalindromeContext(strategy);

            boolean result = context.execute(input);

            if (result) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }

            sc.close();
        }
    }

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                stack.push(c);
            }

            for (char c : s.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }

    static class PalindromeContext {
        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }
}