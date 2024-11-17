import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        char[] s1A = s1.toCharArray();
        char[] s2A = s2.toCharArray();
        Arrays.sort(s1A);
        Arrays.sort(s2A);
        return new String(s1A).equals(new String(s2A));
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + areAnagrams(s1, s2)); // Output: true

        String s3 = "hello";
        String s4 = "world";
        System.out.println("Are \"" + s3 + "\" and \"" + s4 + "\" anagrams? " + areAnagrams(s3, s4)); // Output: false
    }
}
