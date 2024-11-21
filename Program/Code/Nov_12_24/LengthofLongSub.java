package Nov_12_24;

public class LengthofLongSub {
    public int lengthOfLongestSubstring(String s) {
        int maxm = 0;
        int n = s.length();
        int len = 0;
        for (int i = 0; i < n; i++) {
            String st = "";
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (st.contains(String.valueOf(c))) {
                    break;
                }
                st += c;
                len = st.length();
                maxm = Math.max(len, maxm);
            }
        }
        return maxm;
    }

    public static void main(String[] args) {
        LengthofLongSub solution = new LengthofLongSub();

        // Test cases
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = "";

        System.out.println("Longest substring length (\"abcabcbb\"): " + solution.lengthOfLongestSubstring(test1)); // Output: 3
        System.out.println("Longest substring length (\"bbbbb\"): " + solution.lengthOfLongestSubstring(test2));   // Output: 1
        System.out.println("Longest substring length (\"pwwkew\"): " + solution.lengthOfLongestSubstring(test3)); // Output: 3
        System.out.println("Longest substring length (\"\"): " + solution.lengthOfLongestSubstring(test4));       // Output: 0
    }
}
//TC: O(n^3)
//SC = O(n)