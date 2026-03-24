import java.util.Scanner;

public class PalindromeCheckerApp {

    public static class UseCase11PalindromeCheckerApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            PalindromeService service = new PalindromeService();
            boolean result = service.checkPalindrome(input);

            if (result) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }

            sc.close();
        }
    }

    static class PalindromeService {

        public boolean checkPalindrome(String input) {
            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int start = 0;
            int end = normalized.length() - 1;

            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}