package Nov_22_24;

public class IsSubseq {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        IsSubseq solution = new IsSubseq();

        // Test cases
        String s1 = "abc";
        String t1 = "ahbgdc";
        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println("Test 1: " + solution.isSubsequence(s1, t1)); // Output: true
        System.out.println("Test 2: " + solution.isSubsequence(s2, t2)); // Output: false
    }
}
