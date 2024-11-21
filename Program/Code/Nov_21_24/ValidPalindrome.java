package Nov_22_24;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "";

        System.out.println("Test 1: " + solution.isPalindrome(test1)); // Output: true
        System.out.println("Test 2: " + solution.isPalindrome(test2)); // Output: false
        System.out.println("Test 3: " + solution.isPalindrome(test3)); // Output: true
    }
}
