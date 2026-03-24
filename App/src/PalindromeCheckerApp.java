import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static class UseCase13PalindromeCheckerApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            PalindromeStrategy stackStrategy = new StackStrategy();
            PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();

            System.out.println("\nBenchmarking Stack Strategy:");
            benchmark(stackStrategy, input);

            System.out.println("\nBenchmarking Two-Pointer Strategy:");
            benchmark(twoPointerStrategy, input);

            sc.close();
        }

        private static void benchmark(PalindromeStrategy strategy, String input) {
            long startTime = System.nanoTime();
            boolean result = strategy.check(input);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Is Palindrome?: " + result);
            System.out.println("Execution Time (ns): " + duration);
        }
    }

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) stack.push(c);
            for (char c : s.toCharArray())
                if (c != stack.pop()) return false;
            return true;
        }
    }

    static class TwoPointerStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int start = 0, end = s.length() - 1;
            while (start < end) {
                if (s.charAt(start) != s.charAt(end)) return false;
                start++;
                end--;
            }
            return true;
        }
    }
}